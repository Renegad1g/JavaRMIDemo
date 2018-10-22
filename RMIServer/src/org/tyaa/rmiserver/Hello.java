/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.rmiserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author yurii
 */
public class Hello extends UnicastRemoteObject
           implements IHello {
    
    private String message;

    public Hello(String _message) throws RemoteException{
        message = _message;
    }
    
    @Override
    public String say() throws RemoteException {
        return message;
    }

    @Override
    public String sayHello(String _name) throws RemoteException {
        return "Hello, " + _name;
    }
    
}
