package Comands.IMPL;

import Comands.Com;
import Client.Client;
public class ComImpl implements Com {
    @Override
    public void execute() {
        Client.getInstance().handUp(true);
    }

    @Override
    public void undo() {
        Client.getInstance().handUp(false);
    }
}
