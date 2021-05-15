package socket;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8901);
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            Scanner sc=new Scanner(System.in);
            System.out.print("�û���:");
            String name=sc.nextLine();
            System.out.print("����:");
            String code=sc.nextLine();
            pw.write("�û�����"+name+" ���룺"+code);
            pw.flush();
            socket.shutdownOutput();
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info = null;
            while ((info = br.readLine()) != null) {
                System.out.println("������˵��" + info);
            }
            br.close();
            is.close();
            pw.close();
            os.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}