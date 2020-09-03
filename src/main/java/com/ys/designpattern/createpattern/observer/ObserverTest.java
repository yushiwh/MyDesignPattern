package com.ys.designpattern.createpattern.observer;


import com.ys.designpattern.createpattern.observer.classes.ObjectFor3D;
import com.ys.designpattern.createpattern.observer.classes.ObserverUser1;
import com.ys.designpattern.createpattern.observer.classes.ObserverUser2;
import com.ys.designpattern.createpattern.observer.javautil.Observer1;
import com.ys.designpattern.createpattern.observer.javautil.SubjectFor3d;
import com.ys.designpattern.createpattern.observer.javautil.SubjectForSSQ;
import lombok.extern.slf4j.Slf4j;

/**
 * @author nick
 */
@Slf4j
public class ObserverTest {
    public static void main(String[] args) {
        //模拟一个3D的服务号
        ObjectFor3D subjectFor3d = new ObjectFor3D();
        //客户1
        ObserverUser1 observerUser1 = new ObserverUser1(subjectFor3d);
        ObserverUser2 observerUser2 = new ObserverUser2(subjectFor3d);

        subjectFor3d.setMsg("20140420的3D号码是：127");
        subjectFor3d.setMsg("20140421的3D号码是：333");


        /////////////////////系统使用观察者//////////////////////////
        // 创建2个服务号

        //3d
        SubjectFor3d subjectFor3dUtil = new SubjectFor3d();
        //双色球
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();

        // 创建订阅者
        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectFor3dUtil);
        observer1.registerSubject(subjectForSSQ);

        // 发送信息
        subjectFor3dUtil.setMsg("hello 3d'nums : 110 ");
        subjectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");


    }


}

