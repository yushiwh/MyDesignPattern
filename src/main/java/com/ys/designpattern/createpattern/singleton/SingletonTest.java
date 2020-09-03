package com.ys.designpattern.createpattern.singleton;

import com.ys.designpattern.createpattern.singleton.ehan.SingletonEHan;
import com.ys.designpattern.createpattern.singleton.enums.SingletonEnum;
import com.ys.designpattern.createpattern.singleton.inclass.SingletonIn;
import com.ys.designpattern.createpattern.singleton.lanhan.SingletonLanHan;
import lombok.extern.slf4j.Slf4j;

/**
 * 单例模式的调用
 *
 * @author nick
 */
@Slf4j
public class SingletonTest {

    public static void main(String[] args) {
        //饿汉模式
        SingletonEHan singletonEHan = SingletonEHan.getSingletonEHan();
        //饿汉变形模式
        SingletonEHan singletonEHanTwo = SingletonEHan.getSingletonEHanTwo();


        //懒汉模式
        SingletonLanHan singletonLanHan = SingletonLanHan.getSingletonLanHanFour();

        //内部类推荐
        SingletonIn singletonIn = SingletonIn.getInstanceIn();

        //枚举，极力推荐
        SingletonEnum.instance.whateverMethod();

    }
}
