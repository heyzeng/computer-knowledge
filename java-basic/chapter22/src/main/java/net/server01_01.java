package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author:ZJF
 * Date:2021-01-05 上午10:11
 */
public class server01_01 {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();//接受
        System.out.println("等待输入");

        //输入流
        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buffer))!= -1){
            System.out.println(new String(buffer,0,len));
        }

        //关流
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
