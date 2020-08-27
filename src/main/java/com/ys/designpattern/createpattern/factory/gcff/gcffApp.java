package com.ys.designpattern.createpattern.factory.gcff;

/**
 * 简单工厂模式调用
 */
public class gcffApp {
    public static void main(String[] args) {
        //工厂方法模式 (开分店)
        // 分店简单工厂
        XianRoujiaMoStore xianRoujiaMoStore = new XianRoujiaMoStore(new XianSimpleRoujiaMoFactory());

        xianRoujiaMoStore.sellRoujiaMo("Suan");
        xianRoujiaMoStore.sellRoujiaMo("Tian");
        xianRoujiaMoStore.sellRoujiaMo("La");

    }
}
