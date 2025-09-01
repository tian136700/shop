package com.gupaoedu.vip.mall.file.ceph;


import org.javaswift.joss.model.Container;
import org.javaswift.joss.model.StoredObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileHandler {

    @Autowired
    private Container container;

    /**
     * 上传文件
     */

    public void upload(String filename, byte[] buffer) {
        //获取容器
        StoredObject object = container.getObject(filename);
        //上传文件
        object.uploadObject(buffer);
    }

    /**
     * 文件下载
     */
    public byte[] download(String filename) {
        StoredObject object = container.getObject(filename);
        //下载文件
        byte[] bytes = object.downloadObject();
        return bytes;
    }
}
