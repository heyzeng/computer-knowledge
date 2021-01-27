package exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Author:ZJF
 * Date:2021-01-27 上午8:42
 */

//编译异常
public class FileNotFoundException_ {
    public static void main(String[] args) {


        try {
            FileInputStream fileInputStream;
            fileInputStream = new FileInputStream("/dd");
            int len;
            while ((len = fileInputStream.read()) != -1) {
                System.out.println(len);
            }
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
