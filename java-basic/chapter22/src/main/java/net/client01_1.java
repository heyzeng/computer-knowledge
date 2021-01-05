package net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Author:ZJF
 * Date:2021-01-05 上午10:11
 */
public class client01_1 {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello world".getBytes());

        outputStream.close();
        socket.close();
    }
}
