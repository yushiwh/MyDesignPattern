package com.ys.designpattern.createpattern.prototype.shapeimpl;

import com.ys.designpattern.createpattern.prototype.Shape;
import lombok.extern.slf4j.Slf4j;

/**
 * @author nick
 */
@Slf4j
public class Square extends Shape {

    public Square() {
        type = "Square";
    }


    @Override
    public void draw() {
        log.info(String.join("---", "Inside Square::draw() method."));
    }
}
