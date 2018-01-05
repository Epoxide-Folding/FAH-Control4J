package org.epoxide.fahcontrol.response;

public interface IResponseListener {

    int getListenerId ();

    int getUpdateFrequency ();

    String getCommand ();

    void onRecieved (String... responses);

    void onRegistered ();

    void onRemoved ();
}
