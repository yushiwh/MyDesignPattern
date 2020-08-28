package com.ys.designpattern.createpattern.factory.mytest;

import org.springframework.util.StringUtils;

/**
 * @author nick
 */
public class AnimalFactory {

    public Animal createAnimal(String type) {
        if (StringUtils.isEmpty(type)) {
            return null;
        }
        if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        if (type.equalsIgnoreCase("bird")) {
            return new Bird();
        }
        return null;
    }

}
