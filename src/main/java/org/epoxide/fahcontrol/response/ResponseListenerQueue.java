package org.epoxide.fahcontrol.response;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ResponseListenerQueue extends ResponseListenerBase {

    public ResponseListenerQueue (int id, int frequency, String command) {

        super(id, frequency, command);
    }

    @Override
    public void onRecieved (String... responses) {

        for (final String s : responses) {

            System.out.println(s);
        }
    }

    @Override
    public void onRegistered () {

        System.out.println("Registering " + this.getListenerId() + " for " + this.getCommand() + " every " + this.getUpdateFrequency());
    }

    @Override
    public void onRemoved () {

        System.out.println("Removing " + this.getListenerId() + " for " + this.getCommand() + " every " + this.getUpdateFrequency());
    }
}
