/**
 * LCMServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Demo;

public class LCMServiceLocator extends org.apache.axis.client.Service implements Demo.LCMService {

    public LCMServiceLocator() {
    }


    public LCMServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LCMServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LCM
    private java.lang.String LCM_address = "http://localhost:8080/SoapWeb/services/LCM";

    public java.lang.String getLCMAddress() {
        return LCM_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LCMWSDDServiceName = "LCM";

    public java.lang.String getLCMWSDDServiceName() {
        return LCMWSDDServiceName;
    }

    public void setLCMWSDDServiceName(java.lang.String name) {
        LCMWSDDServiceName = name;
    }

    public Demo.LCM getLCM() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LCM_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLCM(endpoint);
    }

    public Demo.LCM getLCM(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Demo.LCMSoapBindingStub _stub = new Demo.LCMSoapBindingStub(portAddress, this);
            _stub.setPortName(getLCMWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLCMEndpointAddress(java.lang.String address) {
        LCM_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Demo.LCM.class.isAssignableFrom(serviceEndpointInterface)) {
                Demo.LCMSoapBindingStub _stub = new Demo.LCMSoapBindingStub(new java.net.URL(LCM_address), this);
                _stub.setPortName(getLCMWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LCM".equals(inputPortName)) {
            return getLCM();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Demo", "LCMService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Demo", "LCM"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LCM".equals(portName)) {
            setLCMEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
