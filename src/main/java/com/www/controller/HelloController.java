package com.www.controller;

import com.www.service.HiSerivce;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

  @Resource
  private HiSerivce hiSerivce;

  @RequestMapping("/hello/{userName}")
  public String hello(@PathVariable String userName) {
    return hiSerivce.getHiMessage(userName);
  }
}
