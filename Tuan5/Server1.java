package Tuan5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) {
        final int PORT = 12346; // port

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server dang cho ket noi tu client..... " );

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client da ket noi: " + clientSocket);

                // Bắt đầu một luồng mới để xử lý client
                Thread clientHandlerThread = new Thread(new ClientHandler(clientSocket));
                clientHandlerThread.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Nhận dữ liệu từ client
class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try (
                // Tạo luồng đầu vào
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                // Tạo luồng đầu ra
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            // Nhận dữ liệu từ client
            String clientMessage;
            while ((clientMessage = in.readLine()) != null) {
                System.out.println("Client gui: " + clientMessage);

                // Xử lý dữ liệu nếu cần

                // Gửi phản hồi lại cho client
                out.println("Server nhan duoc: " + clientMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Đóng socket sau khi xử lý xong
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
