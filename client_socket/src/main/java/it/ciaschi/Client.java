/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.ciaschi;

/**
 *
 * @author nicco
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientStr cliente = new ClientStr();//istanza client
        cliente.connetti();//connessione al server
        cliente.comunica();//comunicazione con il server
    }
    
}
