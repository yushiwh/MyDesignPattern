package com.ys.designpattern.createpattern.factory;


import lombok.extern.slf4j.Slf4j;

/**
 * 静态工厂模式
 * 这个最常见了，项目中的辅助类，TextUtil.isEmpty等，类+静态方法
 *
 * @author nick
 */
@Slf4j
public class StaticFactory {
    public static void main(String[] args) {
        getMes();
    }


    private static void getMes() {
        log.info("我是静态方法");
    }

}

