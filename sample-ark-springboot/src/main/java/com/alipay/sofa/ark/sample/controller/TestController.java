package com.alipay.sofa.ark.sample.controller;

import com.alipay.sofa.ark.sample.facade.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jiaquan
 * @description 测试接口
 * @date 2022/1/24
 **/
@RestController
@RequestMapping("/api/open")
public class TestController {
    @Resource
    private SampleService sampleService;

    @GetMapping("/test/v1")
    public String testV1(){
        return sampleService.service();
    }
}
