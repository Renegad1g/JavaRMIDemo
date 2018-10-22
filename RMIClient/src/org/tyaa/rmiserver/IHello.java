/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.rmiserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author yurii
 */
public interface IHello extends Remote {
    public String say() throws RemoteException;
    public String sayHello(String _name) throws RemoteException;
}
