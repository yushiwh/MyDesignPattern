package com.ys.designpattern.createpattern.factory.mytest.cxfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * 动物实现类
 */
@Slf4j
public class Bird implements Animal {
    @Override
    public void eat() {
        log.info("我是鸟的吃");
    }

    @Override
    public void sleep() {
        log.info("我是鸟的睡");
    }
}
