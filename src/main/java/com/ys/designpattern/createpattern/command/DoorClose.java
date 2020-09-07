package com.ys.designpattern.createpattern.command;

import lombok.AllArgsConstructor;

/**
 * @author nick
 */
@AllArgsConstructor
public class DoorClose implements Command {

    private Door door;

    @Override
    public void execute() {
        door.close();
    }
}
