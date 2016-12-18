package com.zxytech.designpatterns.javaee.compositeentitypattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class CoarseGrainedObject {
    DependentObjectA dependentObjectA = new DependentObjectA();
    DependentObjectB dependentObjectB = new DependentObjectB();

    public void setData(String dataA, String dataB) {
        dependentObjectA.setData(dataA);
        dependentObjectB.setData(dataB);
    }

    public String[] getData() {
        return new String[]{dependentObjectA.getData(), dependentObjectB.getData()};
    }
}
