package com.ys.designpattern.createpattern.template.work;

import com.ys.designpattern.createpattern.template.Worker;
import lombok.extern.slf4j.Slf4j;

/**
 * @author nick
 */
@Slf4j
public class ITWorker extends Worker {

    public ITWorker(String name) {
        super(name);
    }


    /**
     * 重写父类的此方法,使可以查看离开公司时间
     */
    @Override
    public boolean isNeedPrintDate() {
        return true;
    }

    @Override
    public void work() {
        log.info(String.join("--work", "---" + name + ", 写程序 - 测bug - 修复bug"));
    }
}
