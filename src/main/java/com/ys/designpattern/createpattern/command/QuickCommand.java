package com.ys.designpattern.createpattern.command;

import lombok.AllArgsConstructor;

/**
 *
 * @author jingbin
 * @date 2016/10/31
 * 定义一个命令,可以干一系列的事情。
 * 可以执行一连串的命令
 */
@AllArgsConstructor
public class QuickCommand implements Command {

    private Command[] commands;



    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
