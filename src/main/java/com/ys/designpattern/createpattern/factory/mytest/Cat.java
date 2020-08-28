package com.ys.designpattern.createpattern.factory.mytest;

import lombok.extern.slf4j.Slf4j;

/**
 * 猫的实现类
 */
@Slf4j
public class Cat extends Animal {
    @Override
    public void eat() {
        log.info("我是猫的吃法");
    }

    @Override
    public void sleep() {
        log.info("我是猫的吃法");
    }

    public Cat() {
        this.name="我是猫";
    }
}
