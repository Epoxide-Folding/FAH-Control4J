package org.epoxide.fahcontrol.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;

public class FahConnection extends Thread {

    private final IFAHClient client;
    private final Socket socket;
    private final BufferedWriter out;
    private final BufferedReader in;

    public FahConnection (IFAHClient client, Socket socket, BufferedReader in, BufferedWriter out) {

        this.client = client;
        this.socket = socket;
        this.out = out;
        this.in = in;
        this.setName(this.getClass() + "-Thread");
    }

    @Override
    public void run () {

        while (true) {

            try {

                // Read new line
                final String line = this.in.readLine();

                // If PyON response, attempt packet lookup
                if (line.startsWith("PyON")) {

                    final String[] info = line.split(" ");

                    if (info.length >= 2) {

                        // TODO error check please
                        final int id = Integer.parseInt(info[1]);
                        this.client.getResponseManager().handleResponse(id, this.in);
                    }
                }

                // TODO handle better
                else {

                    System.out.println(line);
                }
            }

            catch (final IOException e) {

                // TODO catch
            }
        }
    }
}