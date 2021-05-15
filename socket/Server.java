package socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
public class Server {
    public static void main(String[] args) throws InterruptedException {
        try {
            ServerSocket serverSocket = new ServerSocket(8901);
            Socket socket = null;
            AtomicInteger count = new AtomicInteger();
            System.out.println("***�����������������ȴ��ͻ��˵�����***");
            while (true) {
                socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
                count.incrementAndGet();
                System.out.println("�ͻ��˵�������" + count.get());
                InetAddress address = socket.getInetAddress();
                System.out.println("��ǰ�ͻ��˵�IP��" + address.getHostAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
