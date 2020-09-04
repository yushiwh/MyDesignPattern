package com.ys.designpattern.createpattern.builder;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author jingbin
 * @date 2020-01-31
 * 店长类
 */
@Slf4j
public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product getAProduct() {
        builder.setPart("奥迪汽车", "Q5");
        return builder.getProduct();
    }

    public Product getBProduct() {
        builder.setPart("宝马汽车", "X7");
        return builder.getProduct();
    }

    public Product getCProduct() {
        builder.setPart("别克汽车", "英朗");
        return builder.getProduct();
    }
}
