package threeFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\豆包\\practise\\aa.txt");
        //追加写 FileOutputStream fos=new FileOutputStream("D:\\豆包\\practise\\aa.txt",true);
        byte[] b={'p','g','t','r','l'};
        fos.write(b);
        fos.write("\n".getBytes());  //换行
        byte[] c="世界，你好！".getBytes();
        fos.write(c);
        fos.close();
    }
}
