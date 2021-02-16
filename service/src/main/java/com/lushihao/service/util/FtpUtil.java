package com.lushihao.service.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FtpUtil {

    /**
     * 连接客户端
     */
    private FTPClient ftpClient;
    /**
     * ip地址
     */
    private String ftpIP = "ftp.sinacloud.com";
    /**
     * 端口
     */
    private Integer ftpPort = 10321;
    /**
     * 用户名
     */
    private String ftpUserName = "30b747sMR3OcrzNJwhpn";
    /**
     * 密码
     */
    private String ftpPassword = "0337bf9c076af7634c4f28faea8e18fe18422a71";
    /**
     * 编码格式
     */
    private String ftpEncode = "UTF-8";

    /**
     * 上传新浪云服务器
     *
     * @param file     文件
     * @param fileName 文件名
     * @param type     文件类型
     */
    public synchronized boolean ftpUpload(MultipartFile file, String fileName, String type) {
        try {
            FtpUtil ftpUtil = new FtpUtil();
            if (ftpUtil.connectServer()) {
                if (ftpUtil.upload(file.getInputStream(), fileName, "/schoolservice/" + type)) {
                    ftpUtil.closeServer();
                }
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    /**
     * 删除新浪云服务器文件
     *
     * @param fileName 文件名
     * @param type     文件类型
     */
    public synchronized boolean ftpDelete(String fileName, String type) {
        FtpUtil ftpUtil = new FtpUtil();
        if (ftpUtil.connectServer()) {
            if (ftpUtil.deleteFile("/schoolservice/" + type, fileName)) {
                ftpUtil.closeServer();
            }
        }
        return true;
    }

    /**
     * 连接服务器
     *
     * @return
     */
    private synchronized boolean connectServer() {
        ftpClient = new FTPClient();
        ftpClient.setControlEncoding(ftpEncode);//解决上传文件时文件名乱码
        int reply = 0;
        try {
            // 连接至服务器
            ftpClient.connect(ftpIP, ftpPort);
            // 登录服务器
            ftpClient.login(ftpUserName, ftpPassword);
            //登陆成功，返回码是230
            reply = ftpClient.getReplyCode();
            // 判断返回码是否合法
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                return false;
            }
            //设置以二进制方式传输
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            changePWD("/");
        } catch (SocketException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 删除文件
     *
     * @param targetName
     * @param fileName
     * @return
     */
    private synchronized boolean deleteFile(String targetName, String fileName) {
        try {
            changePWD(targetName);
            //开始删除文件
            ftpClient.dele(fileName);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 切换工作目录
     *
     * @param path
     * @return
     */
    private synchronized boolean changePWD(String path) throws IOException {
        try {
            //切换工作路径，设置上传的路径
            ftpClient.changeWorkingDirectory(path);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 下载文件
     *
     * @param fileName
     * @param targetPath
     * @return
     */
    private synchronized boolean download(String fileName, String targetPath) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(targetPath);
            //设置1M缓冲
            ftpClient.setBufferSize(1024);
            //开始下载文件
            ftpClient.retrieveFile(fileName, outputStream);
            outputStream.flush();
            outputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 上传文件
     *
     * @param fileName
     * @param targetPath
     * @return
     */
    private synchronized boolean upload(InputStream inputStream, String fileName, String targetPath) {
        try {
            changePWD(targetPath);
            //设置1M缓冲
            ftpClient.setBufferSize(1024);
            //设置被动模式
            ftpClient.enterLocalPassiveMode();
            //开始保存文件
            ftpClient.storeFile(fileName, inputStream);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 下载文件夹
     *
     * @param sourcePath
     * @param targetPath
     * @return
     */
    private synchronized boolean downloadDir(String sourcePath, String targetPath, List<String> notCopyFileNames) {
        try {
            ftpClient.enterLocalPassiveMode();
            FTPFile[] files = ftpClient.listFiles(sourcePath);
            changePWD(sourcePath);
            if (files.length > 0) {
                for (FTPFile file : files) {
                    if (notCopyFileNames.stream().filter(s -> StringUtils.equals(s, file.getName())).collect(Collectors.toList()).size() > 0) {
                        continue;
                    }
                    download(file.getName(), targetPath + "\\" + file.getName());
                }
            } else {
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private void closeServer() {
        if (ftpClient != null) {
            try {
                ftpClient.logout();
                ftpClient.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 网络图片转换为BufferedImage
     *
     * @param url
     * @return
     */
    private BufferedImage getImage(String url) {
        try {
            return ImageIO.read(new URL(url));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}