package org.epoxide.fahcontrol.response;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ResponseManager {

    private final Map<Integer, IResponseListener> listeners = new HashMap<>();

    public Map<Integer, IResponseListener> getListeners () {

        return this.listeners;
    }

    public void subscribeListeners (BufferedWriter out) throws IOException {

        for (final Entry<Integer, IResponseListener> entry : this.listeners.entrySet()) {

            out.write("updates add " + entry.getKey() + " " + entry.getValue().getUpdateFrequency() + " " + "$" + entry.getValue().getCommand() + "\n");
            entry.getValue().onRegistered();
        }

        out.flush();
    }

    public void handleResponse (int id, BufferedReader in) {

        if (!this.listeners.containsKey(id)) {

            // TODO warn
            return;
        }

        try {

            final List<String> response = new ArrayList<>();

            boolean processing = true;

            while (processing) {

                final String line = in.readLine();

                // End of response
                if ("---".equalsIgnoreCase(line) || line == null) {

                    processing = false;
                    break;
                }

                // Add lines as response.
                else {

                    response.add(line);
                }
            }

            this.listeners.get(id).onRecieved(response.toArray(new String[0]));
        }

        catch (final Exception e) {

            // TODO warn
        }
    }

    public void registerResponseListener (int id, IResponseListener listener) {

        if (this.listeners.containsKey(id)) {

            // TODO warn
        }

        this.listeners.put(id, listener);
    }

    public void removeResponseListener (int id) {

        if (!this.listeners.containsKey(id)) {

            // TODO warn
            return;
        }

        this.listeners.remove(id).onRemoved();
    }
}