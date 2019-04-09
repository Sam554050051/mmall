package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by jialiang_Lin on 2018/1/31.
 */
public interface IFileService {

    String upload(MultipartFile file,String path);
}
