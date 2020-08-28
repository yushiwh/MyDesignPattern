package com.ys.designpattern.createpattern.factory.mytest.cxfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * 接口实现类
 */
@Slf4j
public class Cat implements Animal {
    @Override
    public void eat() {
        log.info("我是猫的吃");
    }

    @Override
    public void sleep() {
        log.info("我是猫的睡");
    }
}
