//package TC;
//
//import java.io.*;
//import java.net.Socket;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.*;
//
//public class ClientHandlerTest {
//    @Test
//    void constructor_initializesFieldsCorrectly() {
//        Socket mockSocket = Mockito.mock(Socket.class);
//        ChatServer mockServer = Mockito.mock(ChatServer.class);
//        ClientHandler handler = new ClientHandler(mockSocket, mockServer);
//
//        assertThat(handler.getClientSocket()).isEqualTo(mockSocket);
//    }
//
//    @Test
//    void run_readsAndBroadcastsMessages() throws IOException {
//        Socket mockSocket = mock(Socket.class);
//        ChatServer mockServer = mock(ChatServer.class);
//        BufferedReader mockReader = mock(BufferedReader.class);
//        InputStream mockInputStream = mock(InputStream.class);
//
//        when(mockSocket.getInputStream()).thenReturn(mockInputStream);
//        whenNew(BufferedReader.class).withArguments(any(InputStreamReader.class)).thenReturn(mockReader);
//        when(mockReader.readLine()).thenReturn("Test message", (String) null);
//
//        ClientHandler handler = new ClientHandler(mockSocket, mockServer);
//        handler.run();
//
//        verify(mockServer).broadcastMessage("Test message");
//    }
//
//    @Test
//    void sendMessage_sendsCorrectMessage() throws IOException {
//        Socket mockSocket = mock(Socket.class);
//        ChatServer mockServer = mock(ChatServer.class);
//        PrintWriter mockWriter = mock(PrintWriter.class);
//        OutputStream mockOutputStream = mock(OutputStream.class);
//
//        when(mockSocket.getOutputStream()).thenReturn(mockOutputStream);
//        whenNew(PrintWriter.class).withArguments(any(OutputStream.class), eq(true)).thenReturn(mockWriter);
//
//        ClientHandler handler = new ClientHandler(mockSocket, mockServer);
//        handler.sendMessage("Hello");
//
//        verify(mockWriter).println("Hello");
//    }
//
//    @Test
//    void closeConnections_closesAllResources() throws IOException {
//        Socket mockSocket = mock(Socket.class);
//        ChatServer mockServer = mock(ChatServer.class);
//        ClientHandler handler = new ClientHandler(mockSocket, mockServer);
//        BufferedReader mockReader = mock(BufferedReader.class);
//        PrintWriter mockWriter = mock(PrintWriter.class);
//
//        // Assume these are initialized somewhere in ClientHandler
//        handler.setBufferedReader(mockReader);
//        handler.setPrintWriter(mockWriter);
//
//        handler.closeConnections();
//
//        verify(mockSocket).close();
//        verify(mockReader).close();
//        verify(mockWriter).close();
//    }
//}
