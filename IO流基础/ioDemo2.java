package threeFile;

import java.io.FileInputStream;
import java.io.IOException;

public class ioDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\豆包\\practise\\aa.txt");
        byte[] b=new byte[2048];
        fis.read(b);
        fis.close();
        System.out.println(new String(b));
    }


}
