//package TC;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.Socket;
//
//public class ClientHandler {
//    private Socket clientSocket;
//    private ChatServer server;
//    private PrintWriter out;
//    private BufferedReader in;
//
//    public ClientHandler(Socket socket, ChatServer server, BufferedReader in, PrintWriter out) {
//        this.clientSocket = socket;
//        this.server = server;
//        this.in = in;
//        this.out = out;
//    }
//
//
//    public void run() {
//        try {
//            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//            out = new PrintWriter(clientSocket.getOutputStream(), true);
//
//            String message;
//            while ((message = in.readLine()) != null) {
//                server.broadcastMessage(message);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            closeConnections();
//        }
//    }
//
//    public void sendMessage(String message) {
//        out.println(message);
//    }
//
//    public Socket getClientSocket() {
//        return this.clientSocket;
//    }
//
//    private void closeConnections() {
//        try {
//            if (out != null) {
//                out.close();
//            }
//            if (in != null) {
//                in.close();
//            }
//            if (clientSocket != null) {
//                clientSocket.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
