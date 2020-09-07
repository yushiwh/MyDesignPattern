package com.ys.designpattern.createpattern.template.work;

import com.ys.designpattern.createpattern.template.Worker;
import lombok.extern.slf4j.Slf4j;

/**
 * @author nick
 */
@Slf4j
public class HRWorker extends Worker {

    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        log.info(String.join("--work", "---" + name + ", 看简历 - 打电话 - 接电话"));
    }
}
