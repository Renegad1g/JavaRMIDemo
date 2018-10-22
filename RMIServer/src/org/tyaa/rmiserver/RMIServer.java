/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.rmiserver;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author yurii
 */
public class RMIServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            System.setProperty("java.security.policy","file:./server.policy");
            LocateRegistry.createRegistry(1099);
            Registry r = LocateRegistry.getRegistry();
            r.rebind("Hello", new Hello("Some data"));
            System.out.println("Server is connected and ready for operation.");
        } catch (Exception e) {
            System.out.println("Server not connected: " + e);
        }
    }
    
}
