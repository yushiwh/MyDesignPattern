package com.ys.designpattern.createpattern.factory.mytest.cxfactory;

/**
 * @author nick
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Animal getAnimal(String animal) {
        return null;
    }

    @Override
    public Color getColor(String color) {

        if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else {
            return null;
        }
    }
}
