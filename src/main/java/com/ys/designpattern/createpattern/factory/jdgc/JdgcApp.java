package com.ys.designpattern.createpattern.factory.jdgc;

/**
 * 简单工厂模式调用
 */
public class JdgcApp {
    public static void main(String[] args) {
        //简单工厂模式 (店里卖肉夹馍)
        RouJiaMoStore rouJiaMoStore = new RouJiaMoStore(new SimpleRouJiaMoFactroy());
        rouJiaMoStore.sellRouJiaMo("suan");
        rouJiaMoStore.sellRouJiaMo("tian");
        rouJiaMoStore.sellRouJiaMo("la");

    }
}
