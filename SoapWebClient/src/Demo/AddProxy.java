package Demo;

public class AddProxy implements Demo.Add {
  private String _endpoint = null;
  private Demo.Add add = null;
  
  public AddProxy() {
    _initAddProxy();
  }
  
  public AddProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddProxy();
  }
  
  private void _initAddProxy() {
    try {
      add = (new Demo.AddServiceLocator()).getAdd();
      if (add != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)add)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)add)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (add != null)
      ((javax.xml.rpc.Stub)add)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Demo.Add getAdd() {
    if (add == null)
      _initAddProxy();
    return add;
  }
  
  public int findLCM(int a, int b) throws java.rmi.RemoteException{
    if (add == null)
      _initAddProxy();
    return add.findLCM(a, b);
  }
  
  public int gcd(int a, int b) throws java.rmi.RemoteException{
    if (add == null)
      _initAddProxy();
    return add.gcd(a, b);
  }
  
  
}