package Odev2;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptar implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		try {
			KPSPublicSoap client = new KPSPublicSoapProxy();
			
			boolean isValid = client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),
					 customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), 0);
			return isValid;
		} catch (Exception e) {
			
			System.out.println("Giriþ bilgileri doðru deðil");
		}
		
		return false;
	}

}
