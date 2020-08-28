package com.ys.designpattern.createpattern.factory.mytest.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 鸟的实现类
 *
 * @author nick
 */
@Slf4j
public class Bird extends Animal {


    public Bird() {
        this.name="我是鸟";
    }

    @Override
    public void eat() {
        log.info("我是鸟的吃法");
    }

    @Override
    public void sleep() {
        log.info("我是鸟的睡法");
    }
}
