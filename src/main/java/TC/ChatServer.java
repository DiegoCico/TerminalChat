//package TC;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.HashSet;
//import java.util.Set;
//
//public class ChatServer {
//    private static final int PORT;
//
//    public ChatServer(int p){
//        PORT = p;
//    }
//    private Set<ClientHandler> clientHandlers = new HashSet<>();
//
//    public void startServer() {
//        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
//            System.out.println("Server started, waiting for connections...");
//
//            while (true) {
//                Socket clientSocket = serverSocket.accept();
//                ClientHandler clientHandler = new ClientHandler(clientSocket, this);
//                clientHandlers.add(clientHandler);
//                new Thread(String.valueOf(clientHandler)).start();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    void broadcastMessage(String message) {
//        for (ClientHandler clientHandler : clientHandlers) {
//            clientHandler.sendMessage(message);
//        }
//    }
//}
