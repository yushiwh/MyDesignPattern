package com.ys.designpattern.createpattern.builder;


/**
 * 建造者模式
 * 抽象建造者
 * @author nick
 */
public abstract class Builder {

    public abstract  void setPart(String name,String type);
    public abstract Product getProduct();

}
