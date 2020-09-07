package com.ys.designpattern.createpattern.command;

import lombok.extern.slf4j.Slf4j;

/**
 * 定义一个电脑的方法
 * @author nick
 */
@Slf4j
public class Computer {
    public void on(){
        log.info("打开电脑");
    }

    public void off(){
        log.info("关闭电脑");
    }

}
