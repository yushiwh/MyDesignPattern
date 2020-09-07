package com.ys.designpattern.createpattern.command;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author nick
 */
@AllArgsConstructor

public class DoorOpen implements Command {

    private Door door;

    @Override
    public void execute() {
        door.open();
    }
}
