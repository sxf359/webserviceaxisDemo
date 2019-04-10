package client;

import client.ws.HelloWorldService;
import client.ws.HelloWorldServiceLocator;
import client.ws.HelloWorld_PortType;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;
import java.net.URL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Iterator;

public class HelloClient {
    public static void main(String[] args) throws ServiceException, RemoteException {
        HelloWorldService locator=new HelloWorldServiceLocator();
        HelloWorld_PortType service=locator.getHelloWorld();
        System.out.println("start1");
        service.sayHelloWorldFrom("sxf");
        System.out.println("start2");
        service.sayGoodbye("qq");
    }
}