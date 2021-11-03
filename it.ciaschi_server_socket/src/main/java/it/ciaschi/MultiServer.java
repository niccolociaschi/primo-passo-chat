package it.ciaschi;

import java.net.*;
import java.net.InetAddress;

/**
 *
 * @author juliet
 */


public class MultiServer{
    public void start() {
        Array a = new Array();
        try {
            ServerSocket serverSocket = new ServerSocket(6789);
            String ind = InetAddress.getLocalHost().getHostAddress();
            for(;;){//for infinito per istanze continue dei thread per il server
                System.out.println("1 Server in attesa ... " + ind);
                Socket socket = serverSocket.accept();//connessione tra client e server
                System.out.println("3 Server socket " + socket);
                ServerThread serverThread = new ServerThread(socket, serverSocket, a);
                a.aggiungi(serverThread);
                serverThread.start();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Errore durante l'istanza del server !");
            System.exit(1);
        }

    }
    
}