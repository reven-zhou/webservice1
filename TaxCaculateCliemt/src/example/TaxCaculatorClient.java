package example;

import com.TaxCaculateService;
import com.TaxCaculateServiceServiceLocator;
import com.TaxCaculateServiceService;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class TaxCaculatorClient{
    public static void main(String[] argv) {
        TaxCaculateServiceServiceLocator locator = new TaxCaculateServiceServiceLocator();
        TaxCaculateService service = null;
        try {
            service = locator.getTaxCaculateServicePort();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        float income=10000;

        try {
            System.out.println(service.tax(income));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}

