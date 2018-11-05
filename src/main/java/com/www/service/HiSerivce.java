package com.www.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HiSerivce {

  @Resource
  private RestTemplate restTemplate;

  private static final String URL = "http://service-provider/hi";
    //yml配置的提供者名
  public String getHiMessage(String userName) {
    // http://service-provider/hi/jerry
    // 调用service-provider服务的接口，restful形式（getForObject--get）
    return restTemplate.getForObject(URL+"/"+userName,String.class);
  }

}
