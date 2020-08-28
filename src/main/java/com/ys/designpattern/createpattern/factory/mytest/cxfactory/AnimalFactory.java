package com.ys.designpattern.createpattern.factory.mytest.cxfactory;

import org.springframework.util.StringUtils;

/**
 * 抽象工厂扩展类
 *
 * @author nick
 */
public class AnimalFactory extends AbstractFactory {
    @Override
    public Animal getAnimal(String animal) {

        if (animal.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (animal.equalsIgnoreCase("bird")) {
            return new Bird();
        } else {
            return null;
        }

    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
