package com.ys.designpattern.createpattern.command;

import lombok.AllArgsConstructor;

/**
 * 电脑关闭
 * @author nick
 */
@AllArgsConstructor
public class ComputerOff implements Command {

    private Computer computer;


    @Override
    public void execute() {
        computer.off();
    }
}
