package com.ys.designpattern.createpattern.factory.mytest.cxfactory;

public class FactoryProduct {
    /**
     * 根据传入的值进行创建工厂，看创建什么工厂
     *
     * @return
     */
    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("animal")) {
            return new AnimalFactory();
        }
        if (type.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
