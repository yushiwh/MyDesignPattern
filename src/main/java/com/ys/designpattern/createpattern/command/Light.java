package com.ys.designpattern.createpattern.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nick
 */
@Slf4j
public class Light {

    public void on() {
        log.info("开灯");
    }


    public void off() {
        log.info("关灯");
    }

}
