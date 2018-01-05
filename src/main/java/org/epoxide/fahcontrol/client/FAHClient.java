package org.epoxide.fahcontrol.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import org.epoxide.fahcontrol.response.ResponseListenerQueue;
import org.epoxide.fahcontrol.response.ResponseManager;

public class FAHClient implements IFAHClient {

    private Socket socket;
    private BufferedWriter out;
    private BufferedReader in;
    private ResponseManager responseManager;

    @Override
    public void connect (String host, int port) {

        try {

            this.socket = new Socket("127.0.0.1", 36330);
            this.out = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(this.socket.getOutputStream())));
            this.in = new BufferedReader(new InputStreamReader(new BufferedInputStream(this.socket.getInputStream())));

            // Sets up response listeners
            this.responseManager = new ResponseManager();
            this.addResponseListeners(this.responseManager);
            this.responseManager.subscribeListeners(this.out);

            new FahConnection(this, this.socket, this.in, this.out).run();
        }

        catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void addResponseListeners (ResponseManager manager) {

        manager.registerResponseListener(1, new ResponseListenerQueue(1, 1, "queue-info"));
        // TODO abstract
    }

    @Override
    public ResponseManager getResponseManager () {

        return this.responseManager;
    }
}
