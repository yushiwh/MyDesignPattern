package com.ys.designpattern.createpattern.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jingbin
 * @date 2016/10/31
 * 避免=null的情况
 */
@Slf4j
public class NoCommand implements Command {

    @Override
    public void execute() {
        log.error("哥们，这个按钮没有用");
    }
}
