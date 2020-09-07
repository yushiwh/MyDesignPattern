package com.ys.designpattern.createpattern.command;

/**
 * 命令模式:
 * 定义：将"请求"封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
 * 简化: 将请求封装成对象，将动作请求者和动作执行者解耦。
 * 命令模式的核心就是把命令封装成类，对于命令执行者不需要知道现在执行的具体是什么命令。
 * <p>
 * 假设现在有电视、电脑、电灯等家电，现在需要你做个遥控器控制所有家电的开关，
 * 要求做到每个按钮对应的功能供用户个性化，对于新买入家电要有非常强的扩展性。
 *
 * @author nick
 */
public class CommandTest {

    public static void main(String[] args) {
        /**
         * 三个家电
         */
        Door door = new Door();
        Light light = new Light();
        Computer computer = new Computer();


        //设置遥控器按钮对应的位置
        ControlPanel controlPanel = new ControlPanel();
        // 开门
        controlPanel.setCommands(0, new DoorOpen(door));
        // 关门
        controlPanel.setCommands(3, new DoorClose(door));
        // 开灯
        controlPanel.setCommands(1, new LightOpen(light));
        // 关灯
        controlPanel.setCommands(4, new LightOff(light));
        // 开电脑
        controlPanel.setCommands(2, new ComputerOn(computer));
        // 关电脑
        controlPanel.setCommands(5, new ComputerOff(computer));

        //组合快捷键
        QuickCommand quickOpenCommand = new QuickCommand(new Command[]{new LightOpen(light), new ComputerOn(computer), new DoorOpen(door)});
        QuickCommand quickCloseCommand = new QuickCommand(new Command[]{new LightOff(light), new ComputerOff(computer), new DoorClose(door)});
        controlPanel.setCommands(6, quickOpenCommand);
        controlPanel.setCommands(7, quickCloseCommand);
        //模拟点击
        controlPanel.keyPressed(0);
        controlPanel.keyPressed(1);
        controlPanel.keyPressed(2);
        controlPanel.keyPressed(3);
        controlPanel.keyPressed(4);
        controlPanel.keyPressed(5);
        controlPanel.keyPressed(6);
        controlPanel.keyPressed(7);
    }
}
