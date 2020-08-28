package com.ys.designpattern.createpattern.factory.mytest.cxfactory;

import lombok.extern.slf4j.Slf4j;

/**
 *
 */
@Slf4j
public class Blue implements Color {
    @Override
    public void fill() {
        log.info("填充蓝色");
    }
}
