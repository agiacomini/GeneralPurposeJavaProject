package com.giacomini.andrea.jb;

/**
 * Created by Andrea on 18/09/2017.
 */
public class JavaBean {

    // Campi della classe;
    private String fieldString;
    private int fieldInt;
    private boolean fieldBoolean;

    // Costruttori PUBLIC;
    public JavaBean(String fieldString){

        setFieldString(fieldString);
    }

    public JavaBean(String fieldString, int fieldInt){

        setFieldString(fieldString);
        setFieldInt(fieldInt);
    }

    public JavaBean(String fieldString, int fieldInt, boolean fieldBoolean){

        setFieldString(fieldString);
        setFieldInt(fieldInt);
        setFieldBoolean(fieldBoolean);
    }

    // Metodi getter;
    public String getFieldString(){

        return fieldString;
    }

    public int getFieldInt(){

        return fieldInt;
    }

    public boolean isFieldBoolean(){

        return fieldBoolean;
    }

    // Equivalente al precedente metodo "isFieldBoolean()";
    /*public boolean getFieldBoolean(){

        return fieldBoolean;
    }*/

    // Metodi setter;
    public void setFieldString(String fieldString){

        // Verifica le invarianti della classe;
        if(fieldString == null || fieldString.length() == 0){
            throw new IllegalArgumentException("Il campo \"fieldString\" non può essere una stringa vuota o avere un valore null!");
        }
        this.fieldString = fieldString;
    }

    public void setFieldInt(int fieldInt){

        if(fieldInt < 0){
            throw new IllegalArgumentException("Il campo \"fieldInt\" non può essere un numero negativo");
        }
        this.fieldInt = fieldInt;
    }

    public void setFieldBoolean(boolean fieldBoolean){

        this.fieldBoolean = fieldBoolean;
    }

}
