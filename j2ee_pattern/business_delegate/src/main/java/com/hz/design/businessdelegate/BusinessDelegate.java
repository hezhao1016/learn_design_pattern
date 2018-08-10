package com.hz.design.businessdelegate;

/**
 * Created by hezhao on 2018-08-10 14:54
 */
public class BusinessDelegate {

    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookUpService.lookup(serviceType);
        if (businessService != null) {
            businessService.doProcessing();
        } else {
            System.out.println("ServiceType [" + serviceType + "] not found.");
        }
    }

}
