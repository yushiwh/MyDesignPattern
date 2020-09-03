package com.ys.designpattern.createpattern.observer.classes;

import com.ys.designpattern.createpattern.observer.interfaces.Observer;
import com.ys.designpattern.createpattern.observer.interfaces.Subject;
import lombok.extern.slf4j.Slf4j;


/**
 * 模拟第一个使用者
 *
 * @author nick
 */
@Slf4j
public class ObserverUser1 implements Observer {

    public ObserverUser1(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        log.info(String.join("-----ObserverUser1 ", "得到 3D 号码:" + msg + ", 我要记下来。 "));
    }
}
