package com.ys.designpattern.createpattern.factory.mytest.cxfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * 实现类
 * @author nick
 */
@Slf4j
public class Green implements Color {
    @Override
    public void fill() {
      log.info("填充绿色");
    }
}
