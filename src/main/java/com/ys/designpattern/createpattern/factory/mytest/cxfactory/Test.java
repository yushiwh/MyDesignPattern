package com.ys.designpattern.createpattern.factory.mytest.cxfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nick
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        //创建动物工厂
        AbstractFactory animal = FactoryProduct.getFactory("animal");
        Animal a =  animal.getAnimal("cat");
        a.eat();
        a.sleep();

        //创建颜色工厂
        AbstractFactory color = FactoryProduct.getFactory("color");
        Color c = color.getColor("blue");
        c.fill();

    }
}
