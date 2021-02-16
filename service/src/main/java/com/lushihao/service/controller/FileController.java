package com.lushihao.service.controller;

import com.lushihao.service.bean.ConfessionWall;
import com.lushihao.service.bean.Lost;
import com.lushihao.service.bean.Market;
import com.lushihao.service.bean.Play;
import com.lushihao.service.common.Audio;
import com.lushihao.service.common.Image;
import com.lushihao.service.common.ModelType;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.*;
import com.lushihao.service.util.FtpUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("file")
@CrossOrigin
public class FileController {

    @Resource
    private ImageService imageService;
    @Resource
    private AudioService audioService;
    @Resource
    private ConfessionWallService confessionWallService;
    @Resource
    private MarketService marketService;
    @Resource
    private LostService lostService;
    @Resource
    private PlayService playService;

    /**
     * 新浪云图片地址
     */
    private String fileSrc = "http://sinacloud.net/schoolservice/";

    private static final String IMAGE_TYPE = "image";
    private static final String AUDIO_TYPE = "audio";
    private static final String VIDEO_TYPE = "video";

    @RequestMapping("imageupload")
    @ResponseBody
    public Result imageUpload(HttpServletRequest request, HttpServletResponse response,
                              @RequestParam(value = "imagefile", required = false) MultipartFile imagefile) {
        String stuNum = request.getParameterMap().get("stuNum")[0];
        String type = request.getParameterMap().get("type")[0];
        String typeId = request.getParameterMap().get("typeId")[0];
        try {
            String fileType = imagefile.getOriginalFilename().substring(imagefile.getOriginalFilename().lastIndexOf(".")).toLowerCase();
            String fileName = stuNum + "_" + type + "_" + typeId + fileType;

            if (!new FtpUtil().ftpUpload(imagefile, fileName, IMAGE_TYPE)) {
                return Result.fail("失败", "失败");
            }

            Image image = new Image();
            image.setSrc(fileSrc + IMAGE_TYPE + "/" + fileName);
            image.setType(type);
            image.setTypeId(Integer.valueOf(typeId));
            if (imageService.insertOne(image) == 0) {
                delete(type, typeId);
                return Result.fail("失败", "失败");
            }
            return Result.success("成功", "成功");
        } catch (Exception e) {
            delete(type, typeId);
            return Result.fail("失败", "失败");
        }
    }

    @RequestMapping("audioupload")
    @ResponseBody
    public Result audioUpload(HttpServletRequest request, HttpServletResponse response,
                              @RequestParam(value = "audiofile", required = false) MultipartFile audiofile) {
        String stuNum = request.getParameterMap().get("stuNum")[0];
        String type = request.getParameterMap().get("type")[0];
        String typeId = request.getParameterMap().get("typeId")[0];
        try {
            String fileType = audiofile.getOriginalFilename().substring(audiofile.getOriginalFilename().lastIndexOf(".")).toLowerCase();
            String fileName = stuNum + "_" + type + "_" + typeId + fileType;

            if (!new FtpUtil().ftpUpload(audiofile, fileName, AUDIO_TYPE)) {
                return Result.fail("失败", "失败");
            }

            Audio audio = new Audio();
            audio.setSrc(fileSrc + AUDIO_TYPE + "/" + fileName);
            audio.setType(type);
            audio.setTypeId(Integer.valueOf(typeId));
            if (audioService.insertOne(audio) == 0) {
                delete(type, typeId);
                return Result.fail("失败", "失败");
            }
            return Result.success("成功", "成功");
        } catch (Exception e) {
            delete(type, typeId);
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 创建失败的删除操作
     *
     * @param type   模块
     * @param typeId 模块标识
     */
    private void delete(String type, String typeId) {
        switch (type) {
            case ModelType.MODEL_CONFESSIONWALL: {
                ConfessionWall confessionWall = new ConfessionWall();
                confessionWall.setId(Integer.valueOf(typeId));
                confessionWallService.deleteOne(confessionWall);
            }
            case ModelType.MODEL_MARKET: {
                Market market = new Market();
                market.setId(Integer.valueOf(typeId));
                marketService.deleteOne(market);
            }
            case ModelType.MODEL_LOST: {
                Lost lost = new Lost();
                lost.setId(Integer.valueOf(typeId));
                lostService.deleteOne(lost);
            }
            case ModelType.MODEL_PLAY: {
                Play play = new Play();
                play.setId(Integer.valueOf(typeId));
                playService.deleteOne(play);
            }
        }
    }
}
