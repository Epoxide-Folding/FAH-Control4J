package org.epoxide.fahcontrol;

import org.epoxide.fahcontrol.client.FAHClient;

public class Test {

    public static void main (String... strings) {

        final FAHClient client = new FAHClient();
        client.connect("127.0.0.1", 36330);
    }
}