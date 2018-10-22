/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.rmiclient;

import org.tyaa.rmiserver.IHello;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;

/**
 *
 * @author yurii
 */
public class RMIClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.setProperty("java.security.policy","file:./client.policy");
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new RMISecurityManager());
            }
            IHello hello = (IHello) Naming.lookup("rmi://localhost/Hello");
            System.out.println(hello.say());
            System.out.println(hello.sayHello("Medved!"));
        } catch (Exception e) {
            System.out.println("HelloClient exception: " + e);
        }
    }
    
}
