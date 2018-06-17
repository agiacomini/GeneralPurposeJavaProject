package com.giacomini.andrea;

/**
 * Created by Andrea on 28/06/2017.
 */
public class ClassGeneral {

    // INCAPSULAMENTO: campi PRIVATE e metodi (set()/get()) PUBLIC;
    private String fieldString;
    private StringBuilder fieldStringBuilder;
    private int fieldInt;

    public void setFieldString(String fieldString){
        this.fieldString = fieldString;
    }

    public StringBuilder getFieldStringBuilder() {

        return fieldStringBuilder;
    }

    public String getFieldString(){

        return fieldString;
    }

    public void setFieldStringBuilder(StringBuilder fieldStringBuilder) {

        this.fieldStringBuilder = fieldStringBuilder;
    }

    public int getFieldInt() {

        return fieldInt;
    }

    public void setFieldInt(int fieldInt) {

        this.fieldInt = fieldInt;
    }

    // Overriding the method "toString()" inherited from Object class
    public String toString() {

        return "fieldString: '" + this.fieldString + "', fieldStringBuilder: '" + this.fieldStringBuilder + "', fieldInt: '" + this.fieldInt + "'";
    }

    // COSTRUTTORE senza argomenti;
    public ClassGeneral(){

    }

    // COSTRUTTORE con un parametro di input (String s);
    public ClassGeneral(String s){

        this.fieldString = s;
    }

    // COSTRUTTORE con un parametro di input (int i);
    public ClassGeneral(int i){

        this.fieldInt = i;
    }

    // COSTRUTTORE con un parametro di input (StringBuilder sb);
    public ClassGeneral(StringBuilder sb){

        this.fieldStringBuilder = sb;
    }

    // COSTRUTTORE con due parametri di input (String s, int i);
    public ClassGeneral(String s, int i){

        this.fieldString = s;
        this.fieldInt = i;
    }

    // COSTRUTTORE con due parametri di input (String s, StringBuilder sb);
    public ClassGeneral(String s, StringBuilder sb){

        this.fieldString = s;
        this.fieldStringBuilder = sb;
    }

    public void testClassGeneral(){

        System.out.println("testClassGeneral() method in \"ClassGeneral.java\" file.");
    }

    public static void main(String[] args) throws Exception{

        System.out.println("ClassGeneral.java");

        if(false){
            System.out.println("enums");
        }
    }

    public void coreBusiness() throws Exception{

        int i = 0;
        long l = 0L;
        String s = "";

        try{

        } catch(Exception e){

        } finally{

        }
    }

    // Metodo "Utility" definito PRIVATE perché richiamabile solo all'interno della classe;
    private void utility() throws Exception{

        int i = 0;
        long l = 0L;
        String s = "";

        try{

        }catch(Exception e){


        }
    }
}
