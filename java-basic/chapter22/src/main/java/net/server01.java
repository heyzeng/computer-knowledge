package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author:ZJF
 * Date:2021-01-05 上午9:38
 */
public class server01 {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);

        System.out.println("服务器在 9999端口监听，等待连接");
        Socket socket = serverSocket.accept();

        //输入流
        InputStream inputStream = socket.getInputStream();
        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len = inputStream.read(buffer))!= -1){
            System.out.println(new String(buffer,0,len));
        }

        //关流
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
