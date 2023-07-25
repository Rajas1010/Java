 import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import java.io.Serializable;

// must implement Serializable in order to be sent
class Message implements Serializable {
    private final String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

public class ServerSarray {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // don't need to specify a hostname, it will be the current machine
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("ServerSocket awaiting connections...");
        Socket socket = ss.accept(); // blocking call, this will wait until a connection is attempted on this port.
        System.out.println("Connection from " + socket + "!");

        // get the input stream from the connected socket
        InputStream inputStream = socket.getInputStream();
        // create a DataInputStream so we can read data from it.
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        // read the list of messages from the socket
        // stored in listOfMessages array
        List<Message> listOfMessages = (List<Message>) objectInputStream.readObject();
        // Stored in "messages" array
        List<Message> messages = new ArrayList<>();
        System.out.println("Received [" + listOfMessages.size() + "] messages from: " + socket);
        // print out the text of every message
        System.out.println("All messages:");
        listOfMessages.forEach((msg) -> messages.add(msg.getText()));
        for (Message m : messages) {
            System.out.println(m);
        }
        System.out.println("Closing sockets.");
        ss.close();
        socket.close();
    }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 /*import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import java.io.Serializable;

// must implement Serializable in order to be sent
class Message implements Serializable{
    private final String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
public class ServerSarray {
   public static void main(String[] args) throws IOException, ClassNotFoundException {
        // don't need to specify a hostname, it will be the current machine
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("ServerSocket awaiting connections...");
        Socket socket = ss.accept(); // blocking call, this will wait until a connection is attempted on this port.
        System.out.println("Connection from " + socket + "!");

        // get the input stream from the connected socket
        InputStream inputStream = socket.getInputStream();
        // create a DataInputStream so we can read data from it.
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        // read the list of messages from the socket
        List<Message> listOfMessages = (List<Message>) objectInputStream.readObject();
        System.out.println("Received [" + listOfMessages.size() + "] messages from: " + socket);
        // print out the text of every message
        System.out.println("All messages:");
        listOfMessages.forEach((msg)-> System.out.println(msg.getText()));

        System.out.println("Closing sockets.");
        ss.close();
        socket.close();
		}
	
}*/