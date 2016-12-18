package com.zxytech.designpatterns.javaee.businessdelegatepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class BusinessDelegate {
    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
