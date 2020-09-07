package com.ys.designpattern.createpattern.command;

import lombok.AllArgsConstructor;

/**
 * @author nick
 */
@AllArgsConstructor
public class LightOff implements Command {

    private Light light;

    @Override
    public void execute() {
        light.off();
    }
}
