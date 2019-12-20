package com.song.dubbo.service.impl;

import com.song.dubbo.service.SayHelloService;
import org.springframework.stereotype.Service;

/**
 * @author songjianhua
 * @date 2019-12-20 16:42
 * @description:
 **/
@Service("sayHelloService")
public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public void test() {
        System.out.println("123");
    }
}
