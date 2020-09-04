package com.ys.designpattern.createpattern.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * 1、创建一个实现了Cloneable接口的抽象类
 *
 * @author nick
 */
@Slf4j
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            log.info(String.join("--", e.getMessage()));
        }
        return object;
    }
}
