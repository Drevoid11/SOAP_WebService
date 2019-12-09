/**
 * LCMService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Demo;

public interface LCMService extends javax.xml.rpc.Service {
    public java.lang.String getLCMAddress();

    public Demo.LCM getLCM() throws javax.xml.rpc.ServiceException;

    public Demo.LCM getLCM(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
