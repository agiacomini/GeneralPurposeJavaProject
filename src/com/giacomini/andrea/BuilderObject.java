package com.giacomini.andrea;

import java.util.List;

/**
 * Created by Andrea on 18/09/2017.
 */

// Classe Builder della classe target "ImmutableObject", inserita nello stesso package della classe target;
public class BuilderObject {

    private String fieldString;
    private int fieldInt;
    private boolean fieldBoolean;
    // Riferimento ad un'oggetto mutabile;
    private List<String> fieldList;

    public BuilderObject setFieldString(String fieldString){

        this.fieldString = fieldString;
        return this;
    }

    public BuilderObject setFieldInt(int fieldInt){

        this.fieldInt = fieldInt;
        return this;
    }

    public BuilderObject setFieldBoolean(boolean fieldBoolean){

        this.fieldBoolean = fieldBoolean;
        return this;
    }

    public BuilderObject setFieldList(List<String> fieldList){

        this.fieldList = fieldList;
        return this;
    }

    public ImmutableObject build(){

        return new ImmutableObject(fieldString,fieldInt,fieldBoolean,fieldList);
    }


}
