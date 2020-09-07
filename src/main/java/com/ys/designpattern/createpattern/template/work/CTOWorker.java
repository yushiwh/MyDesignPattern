package com.ys.designpattern.createpattern.template.work;

import com.ys.designpattern.createpattern.template.Worker;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CTOWorker extends Worker {

    public CTOWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        log.info(String.join("--work", "---" + name + ", 开会 - 出API - 检查进度"));
    }
}
