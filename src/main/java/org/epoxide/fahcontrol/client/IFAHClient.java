package org.epoxide.fahcontrol.client;

import org.epoxide.fahcontrol.response.ResponseManager;

public interface IFAHClient {

    // TODO support auth
    void connect (String host, int port);

    void addResponseListeners (ResponseManager manager);

    ResponseManager getResponseManager ();
}