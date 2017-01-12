package designpatterns.businessdelegate.client;

import designpatterns.businessdelegate.BusinessDelegate;

public class Client {

	BusinessDelegate businessService;
	
	public Client(BusinessDelegate businessDelegate) {
		this.businessService = businessDelegate;
	}
	
	public void doTask() {
		businessService.doTask();
	}
}
