package com.ys.designpattern.createpattern.prototype.shapeimpl;

import com.ys.designpattern.createpattern.prototype.Shape;
import lombok.extern.slf4j.Slf4j;

/**
 * @author nick
 *  2. 创建扩展了上面抽象类的实体类。Rectangle 矩形
 */
@Slf4j
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        log.info(String.join("---", "Inside Rectangle::draw() method."));
    }

}
