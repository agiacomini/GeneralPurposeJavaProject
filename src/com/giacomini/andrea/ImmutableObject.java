package com.giacomini.andrea;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrea on 18/09/2017.
 */
public final class ImmutableObject {

    private final String fieldString;
    private final int fieldInt;
    private final boolean fieldBoolean;
    // Riferimento ad un'oggetto mutabile;
    private final List<String> fieldList;

    // Costruttore 1;
    public ImmutableObject(String fieldString, int fieldInt, boolean fieldBoolean, List fieldList){

        this.fieldString = fieldString;
        this.fieldInt = fieldInt;
        this.fieldBoolean = fieldBoolean;

        // Valuta l'invarianza dell'oggetto. Deve essere sempre specificata una List per l'oggetto;
        // L'invarianza viene valutata nel costruttore perché in una classe immutabile non ci sono metodi setter;
        if(fieldList == null){
            throw new RuntimeException("fieldList is required");
        }
        this.fieldList = new ArrayList<String>(fieldList);

    }

    // Costruttore 2;
    public ImmutableObject(String fieldString, List fieldList){

        this.fieldString = fieldString;
        this.fieldInt = 0;
        this.fieldBoolean = false;
        if(fieldList == null ){

            throw new RuntimeException("fieldList is required");
        }

        this.fieldList = new ArrayList<String>(fieldList);

    }

    // Metodi getter;
    public String getFieldString(){

        return fieldString;
    }

    public int getFieldInt(){

        return fieldInt;
    }

    public boolean getFieldBoolean(){

        return fieldBoolean;
    }

    public int getFieldListCount(){

        return fieldList.size();
    }

    public String getFieldList(int index){

        return fieldList.get(index);
    }

    // NO metodi setter;

    // Classe Builder della classe target "ImmutableObject", inserita come inner-class della classe target;
    class BuilderObject2{

        private String fieldString;
        private int fieldInt;
        private boolean fieldBoolean;
        // Riferimento ad un'oggetto mutabile;
        private List<String> fieldList;

        public BuilderObject2 setFieldString(String fieldString){

            this.fieldString = fieldString;
            return this;
        }

        public BuilderObject2 setFieldInt(int fieldInt){

            this.fieldInt = fieldInt;
            return this;
        }

        public BuilderObject2 setFieldBoolean(boolean fieldBoolean){

            this.fieldBoolean = fieldBoolean;
            return this;
        }

        public BuilderObject2 setFieldList(List<String> fieldList){

            this.fieldList = fieldList;
            return this;
        }

        public ImmutableObject build(){

            return new ImmutableObject(fieldString,fieldInt,fieldBoolean,fieldList);
        }
    }
}
