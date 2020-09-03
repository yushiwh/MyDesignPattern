package com.ys.designpattern.createpattern.observer.javautil;


import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * 最后是我们的使用者：
 *
 * @author nick
 */
@Slf4j
public class Observer1 implements Observer {

    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3d) {
            SubjectFor3d subjectFor3d = (SubjectFor3d) o;
            log.info(String.join("SubjectFor3d:", "subjectFor3d's msg -- >" + subjectFor3d.getMsg()));

        }
        if (o instanceof SubjectForSSQ) {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            log.info(String.join("SubjectForSSQ:", "subjectForSSQ's msg -- >" + subjectForSSQ.getMsg()));
        }
    }
}
