package com.ys.designpattern.createpattern.observer.classes;

import com.ys.designpattern.createpattern.observer.interfaces.Observer;
import com.ys.designpattern.createpattern.observer.interfaces.Subject;

import java.util.ArrayList;

/**
 * @author nick
 * 接下来3D服务号的实现类：
 */
public class ObjectFor3D implements Subject {


    private ArrayList<Observer> observers = new ArrayList<>();

    /**
     * 3D 彩票的号码
     */
    private String msg;


    /**
     * 主题更新
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
