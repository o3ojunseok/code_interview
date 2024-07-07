package basic.pattern.command.logging;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Command> commandList = new ArrayList<>();

    public void takeOrder(Command command) {
        commandList.add(command);
    }

    public void placeOrders() {
        for (Command command : commandList) {
            command.execute();
        }

        commandList.clear();
    }

}