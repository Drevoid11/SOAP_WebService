package Demo;

public class LCMProxy implements Demo.LCM {
  private String _endpoint = null;
  private Demo.LCM lCM = null;
  
  public LCMProxy() {
    _initLCMProxy();
  }
  
  public LCMProxy(String endpoint) {
    _endpoint = endpoint;
    _initLCMProxy();
  }
  
  private void _initLCMProxy() {
    try {
      lCM = (new Demo.LCMServiceLocator()).getLCM();
      if (lCM != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)lCM)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)lCM)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (lCM != null)
      ((javax.xml.rpc.Stub)lCM)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Demo.LCM getLCM() {
    if (lCM == null)
      _initLCMProxy();
    return lCM;
  }
  
  
}