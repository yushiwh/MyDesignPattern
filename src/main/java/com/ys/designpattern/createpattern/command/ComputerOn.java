package com.ys.designpattern.createpattern.command;

import lombok.AllArgsConstructor;

/**
 * 打开电脑
 * @author nick
 */
@AllArgsConstructor
public class ComputerOn implements Command {

    private Computer computer;

    @Override
    public void execute() {
        computer.on();
    }
}
