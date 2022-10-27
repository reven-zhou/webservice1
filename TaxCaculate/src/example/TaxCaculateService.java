package example;

import com.TaxCaculate;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class TaxCaculateService {

    @WebMethod
    public float tax(float income){
        TaxCaculate caculator=new TaxCaculate();
        return caculator.Caculate(income);
    }

    public static void main(String[] argv){
        Object imp=new TaxCaculateService();
        String address="http://localhost:5000/TaxCaculateService";
        Endpoint.publish(address,imp);
        System.out.println("WebService服务器启动成功！");
    }
}
