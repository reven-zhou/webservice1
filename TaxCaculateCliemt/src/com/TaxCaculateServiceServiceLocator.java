/**
 * TaxCaculateServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class TaxCaculateServiceServiceLocator extends org.apache.axis.client.Service implements com.TaxCaculateServiceService {

    public TaxCaculateServiceServiceLocator() {
    }


    public TaxCaculateServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TaxCaculateServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TaxCaculateServicePort
    private java.lang.String TaxCaculateServicePort_address = "http://localhost:5000/TaxCaculateService";

    public java.lang.String getTaxCaculateServicePortAddress() {
        return TaxCaculateServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TaxCaculateServicePortWSDDServiceName = "TaxCaculateServicePort";

    public java.lang.String getTaxCaculateServicePortWSDDServiceName() {
        return TaxCaculateServicePortWSDDServiceName;
    }

    public void setTaxCaculateServicePortWSDDServiceName(java.lang.String name) {
        TaxCaculateServicePortWSDDServiceName = name;
    }

    public com.TaxCaculateService getTaxCaculateServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TaxCaculateServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTaxCaculateServicePort(endpoint);
    }

    public com.TaxCaculateService getTaxCaculateServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.TaxCaculateServicePortBindingStub _stub = new com.TaxCaculateServicePortBindingStub(portAddress, this);
            _stub.setPortName(getTaxCaculateServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTaxCaculateServicePortEndpointAddress(java.lang.String address) {
        TaxCaculateServicePort_address = address;
    }



    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.TaxCaculateService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.TaxCaculateServicePortBindingStub _stub = new com.TaxCaculateServicePortBindingStub(new java.net.URL(TaxCaculateServicePort_address), this);
                _stub.setPortName(getTaxCaculateServicePortWSDDServiceName());
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
        if ("TaxCaculateServicePort".equals(inputPortName)) {
            return getTaxCaculateServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example/", "TaxCaculateServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example/", "TaxCaculateServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TaxCaculateServicePort".equals(portName)) {
            setTaxCaculateServicePortEndpointAddress(address);
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
