package com.ys.designpattern.createpattern.factory.jdgc;

import lombok.extern.slf4j.Slf4j;

/**
 * 各种肉夹馍的抽象方法
 */
@Slf4j
public abstract class RouJiaMo {

    public String name;

    /**
     * 准备工作
     */
    public void prepare() {
        log.info("完成准备工作");
    }

    /**
     * 打包
     */
    public void pack() {
        log.info("完成打包");
    }

    /**
     * 烤
     */
    public void fire() {
        log.info("完成烘烤");
    }


}
