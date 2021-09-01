package threeFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filecopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\若久\\Pictures\\Saved Pictures\\1.png");
        FileOutputStream fos=new FileOutputStream("D:\\豆包\\practise\\1.png");
        int len=0;
        /*while((len=fis.read())!=-1)
        {
            fos.write(len);
        }*/
        byte[] b=new byte[1024];
        while((len=fis.read(b))!=-1)
        {
            fos.write(b,0,len);
        }
        fis.close();
        fos.close();
    }
}
