package com.zxytech.designpatterns.javaee.compositeentitypattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class CompositeEntity {
    private CoarseGrainedObject coarseGrainedObject = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        coarseGrainedObject.setData(data1, data2);
    }

    public String[] getData() {
        return coarseGrainedObject.getData();
    }
}
