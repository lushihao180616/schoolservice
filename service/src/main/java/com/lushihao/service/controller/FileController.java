package com.lushihao.service.controller;

import com.lushihao.service.bean.ConfessionWall;
import com.lushihao.service.common.Image;
import com.lushihao.service.common.ModelType;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.ConfessionWallService;
import com.lushihao.service.service.ImageService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller
@RequestMapping("file")
@CrossOrigin
public class FileController {

    @Value("${filePath}")
    private String filePath;

    @Resource
    private ImageService imageService;
    @Resource
    private ConfessionWallService confessionWallService;

    @RequestMapping("imageupload")
    @ResponseBody
    public Result doUpload(HttpServletRequest request, HttpServletResponse response,
                           @RequestParam(value = "imagefile", required = false) MultipartFile imagefile) {
        String stuNum = request.getParameterMap().get("stuNum")[0];
        String type = request.getParameterMap().get("type")[0];
        String typeId = request.getParameterMap().get("typeId")[0];
        try {
            String fileType = imagefile.getOriginalFilename().substring(imagefile.getOriginalFilename().lastIndexOf(".")).toLowerCase();
            String fileName = stuNum + "_" + type + "_" + typeId + fileType;

            File targetFile = new File(filePath, fileName);
            String src = filePath + fileName;
            if (!targetFile.exists()) {
                targetFile.mkdirs();
            }
            imagefile.transferTo(targetFile);

            Image image = new Image();
            image.setSrc(src);
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

    private void delete(String type, String typeId) {
        if (StringUtils.equals(type, ModelType.MODEL_CONFESSIONWALL)) {
            ConfessionWall confessionWall = new ConfessionWall();
            confessionWall.setId(Integer.valueOf(typeId));
            confessionWallService.deleteOne(confessionWall);
        }
    }
}
