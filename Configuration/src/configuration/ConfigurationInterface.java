package configuration;

import java.net.InetAddress;
import java.rmi.Remote;
import java.util.ArrayList;
import sharedPackage.RoutingTableKey;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author maria afara
 */
public interface ConfigurationInterface extends Remote {

    public void initializeConnection(int port, InetAddress neighboraddress, String neighborhostname,
            int neighborport) throws java.rmi.RemoteException;

    public void initializePort(int port) throws java.rmi.RemoteException;

    public void setHostname(String hostname) throws java.rmi.RemoteException;

    public String getHostname() throws java.rmi.RemoteException;

    public InetAddress getLocalHost() throws java.rmi.RemoteException;

    public void initializeRoutingProtocol(ArrayList<RoutingTableKey> networks) throws java.rmi.RemoteException;

}
