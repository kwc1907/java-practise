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
            System.out.println("***服务器即将启动，等待客户端的连接***");
            while (true) {
                socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
                count.incrementAndGet();
                System.out.println("客户端的数量：" + count.get());
                InetAddress address = socket.getInetAddress();
                System.out.println("当前客户端的IP：" + address.getHostAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
