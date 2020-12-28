package throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Author:Jude
 * Date:2020-12-26 上午11:35
 */
public class ThrowsTest {

    public static void main(String[] args) throws FileNotFoundException {

        FileHandle();

    }

    public static void FileHandle() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/aa");
    }
}
