package org.epoxide.fahcontrol.response;

public abstract class ResponseListenerBase implements IResponseListener {

    private final int id;
    private final int frequency;
    private final String command;

    public ResponseListenerBase (int id, int frequency, String command) {

        this.id = id;
        this.frequency = frequency;
        this.command = command;
    }

    @Override
    public int getListenerId () {

        return this.id;
    }

    @Override
    public int getUpdateFrequency () {

        return this.frequency;
    }

    @Override
    public String getCommand () {

        return this.command;
    }
}
