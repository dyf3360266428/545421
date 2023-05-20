package com.service;


import com.dao.UserDao;
import com.pojo.User;
import com.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author zjzhou
 * @version 1.0
 */

public abstract class UserService {

    abstract boolean login(String username, String password);

    abstract boolean register(User user);


//    @Autowired
    private UserDao userMapper; // Spring 注入 UserMapper 对象
    /**
     * 用户注册，记录用户信息并处理上传的图片
     * @param user
     * @param file
     * @return
     */
    public boolean saveRegister(User user, MultipartFile file){
        if (file != null){
            // 原始文件名
            String originalFileName = file.getOriginalFilename();
            // 获取图片后缀
            String suffix = originalFileName.substring(originalFileName.lastIndexOf("."));
            // 生成图片存储的名称，UUID 避免相同图片名冲突，并加上图片后缀
            String fileName = UUID.randomUUID().toString() + suffix;
            // 图片存储路径
            String filePath = Constants.IMG_PATH + fileName;
            File saveFile = new File(filePath);
            try {
                // 将上传的文件保存到服务器文件系统
                file.transferTo(saveFile);
                // 记录服务器文件系统图片名称
                user.setUserPic(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 持久化 user
        return userMapper.insertSelective(user) > 0;
    }

    /**
     * 查找指定 key 的 user 对象
     * @param userId
     * @return
     */
    public User findByUserId(int userId){
        return userMapper.selectByPrimaryKey(userId);
    }
}
