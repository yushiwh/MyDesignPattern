package com.ys.designpattern.createpattern.template;

import com.ys.designpattern.createpattern.template.work.CTOWorker;
import com.ys.designpattern.createpattern.template.work.HRWorker;
import com.ys.designpattern.createpattern.template.work.ITWorker;
import lombok.extern.slf4j.Slf4j;

/**
 * 模版方法模式 展现程序员的一天
 * 定义：定义了一个算法的骨架，而将一些步骤延迟到子类中，模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的步骤。
 * 以公司人员一天上班为例:
 * 简单描述一下：本公司有程序猿、测试、HR、项目经理等人，下面使用模版方法模式，记录下所有人员的上班情况：
 * <p>
 * 模版方式里面也可以可选的设置钩子，比如现在希望记录程序员离开公司的时间，我们就可以在超类中添加一个钩子：
 *
 * @author nick
 */
@Slf4j
public class TemplateTest {

    public static void main(String[] args) {

        ITWorker itWorker = new ITWorker("景彬");
        itWorker.workOneDay();
        log.info("#####################################");
        HRWorker hrWorker = new HRWorker("莉莉姐");
        hrWorker.workOneDay();
        log.info("#####################################");
        CTOWorker ctoWorker = new CTOWorker("远哥");
        ctoWorker.workOneDay();
    }
}
