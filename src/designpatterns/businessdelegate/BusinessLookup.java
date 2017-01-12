package designpatterns.businessdelegate;

import designpatterns.businessdelegate.services.BusinessService;
import designpatterns.businessdelegate.services.EJBService;
import designpatterns.businessdelegate.services.JMSService;

public class BusinessLookup {
	
	private static final String EJB = "EJB";

	public BusinessService getBusinessService(String serviceType){
		
		if (serviceType.equalsIgnoreCase(EJB)){
			return new EJBService();
		}
		
		return new JMSService();
	}

}
