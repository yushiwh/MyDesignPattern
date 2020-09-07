package com.ys.designpattern.createpattern.command;

import lombok.AllArgsConstructor;

/**
 *
 * @author nick
 */
@AllArgsConstructor
public class LightOpen implements Command {

    private Light light;

    @Override
    public void execute() {
        light.on();
    }
}
