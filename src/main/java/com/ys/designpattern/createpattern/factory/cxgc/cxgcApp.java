package com.ys.designpattern.createpattern.factory.cxgc;


/**
 * 简单工厂模式调用
 */
public class cxgcApp {
    public static void main(String[] args) {
        //抽象工厂模式 (使用官方提供的原料)
        //定义：提供一个接口，用于创建相关的或依赖对象的家族，而不需要明确指定具体类。
        XianRoujiaMoTeSeStore xianRoujiaMoTeSeStore = new XianRoujiaMoTeSeStore(new XianSimpleRoujiaMoTeSeFactory());
        xianRoujiaMoTeSeStore.sellRoujiaMo("suan");

    }
}
