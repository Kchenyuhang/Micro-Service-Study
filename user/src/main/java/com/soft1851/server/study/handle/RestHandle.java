package com.soft1851.server.study.handle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/9/16
 */
@RestController
@RequestMapping(value = "/rest")
public class RestHandle {
    @Resource
    private RestTemplate restTemplate;


}
