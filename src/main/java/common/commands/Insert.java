package common.commands;

import common.content.SpaceMarine;
import server.CollectionManager;

public class Insert extends Command {
    public Insert(boolean newbie, String login, String password, Integer intArg, SpaceMarine smArg) {
        super(newbie, login, password);
        this.intArg = intArg;
        this.smArg = smArg;
    }

    @Override
    public String execute(CollectionManager cm) {
        return cm.insert(intArg, smArg, user.getLogin());
    }
}
