package net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Author:ZJF
 * Date:2021-01-05 上午9:38
 */
public class client01 {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        //输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello world".getBytes());

        //关流
        outputStream.close();
        socket.close();

    }
}
