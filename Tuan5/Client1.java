package Tuan5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client1 {
    public static void main(String[] args) {
        final String SERVER_ADDRESS = "192.168.200.197";
        final int PORT = 12346;

        try (Socket socket = new Socket(SERVER_ADDRESS, PORT);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {

            System.out.println("Client da ket noi voi server");
            String userInputLine;

            while ((userInputLine = userInput.readLine()) != null) {
                out.println(userInputLine); // gửi dữ liệu lên server
                String response = in.readLine(); // nhận phản hồi từ server
                System.out.println("Server phan hoi: " + response); // in ra nội dung phản hồi
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

