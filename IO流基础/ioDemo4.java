package threeFile;

import java.io.FileWriter;
import java.io.IOException;

public class ioDemo4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\豆包\\practise\\aa.txt",true);
        String a="fsdfdgg城市不舍得";
        fw.write(a);
        fw.flush();
        fw.close();
    }
}
