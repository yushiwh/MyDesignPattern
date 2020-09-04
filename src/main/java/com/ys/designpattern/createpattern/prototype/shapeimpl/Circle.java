package com.ys.designpattern.createpattern.prototype.shapeimpl;

import com.ys.designpattern.createpattern.prototype.Shape;
import lombok.extern.slf4j.Slf4j;

/**
 * @author nick
 */
@Slf4j
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        log.info(String.join("---", "Inside Circle::draw() method."));
    }
}
