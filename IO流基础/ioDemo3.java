package threeFile;

import java.io.FileReader;
import java.io.IOException;

public class ioDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\Users\\若久\\Desktop\\随缘记事本\\Java.txt");
        int len=0;
        char[] c=new char[1024];
        while((len=fr.read(c))!=-1)
        {
            System.out.println(new String(c,0,len));
        }
        fr.close();

    }
}
