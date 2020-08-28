package com.ys.designpattern.createpattern.factory.mytest.cxfactory;

/**
 * 抽象工厂创建动物和颜色
 *
 * @author nick
 */
public abstract class AbstractFactory {
    public abstract Animal getAnimal(String animal);

    public abstract Color getColor(String color);
}
