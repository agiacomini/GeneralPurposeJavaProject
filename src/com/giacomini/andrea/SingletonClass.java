package com.giacomini.andrea;

/**
 * Created by Andrea on 18/09/2017.
 */
public class SingletonClass
{
    // Campi PRIVATE;
    private String fieldString = "contenuto di fieldString";
    private int fieldInt = 0;
    private boolean fieldBoolean = true;

    // Costruttore PRIVATE per non permettere alle altre classi di creare un altra istanza della classe;
    private SingletonClass(){ }

    //-------------------- 1- MODO DI ISTANZIARE L'OGGETTO SINGLETON ------------------//
    
    // Istanzia l'oggetto Singleton - Dichiara e inizializza l'oggetto sulla stessa riga;
    // Riferimento all'oggetto singleton che verrà condiviso tra più classi;
    private static final SingletonClass instance = new SingletonClass();
    
    //------------------- ./1- MODO DI ISTANZIARE L'OGGETTO SINGLETON -----------------//

    //-------------------- 2- MODO DI ISTANZIARE L'OGGETTO SINGLETON ------------------//
    
    // Dichiara il riferimento all'oggetto Singleton;
    private static final SingletonClass instance2;

    // Inizializza l'oggetto Singleton in un blocco STATIC;
    static 
    {
        instance2 = new SingletonClass();
    }
    
    //------------------- ./2- MODO DI ISTANZIARE L'OGGETTO SINGLETON -----------------//

    // Metodo che ritorna il riferimento dell'oggetto singleton;
    public static SingletonClass getInstance(){ return instance; }

    // "synchronized" previene che due processi thread eseguano contemporaneamente lo stesso metodo;
    public synchronized void addFieldInt( int amount )
    {
        fieldInt += amount;
    }

    // "synchronized" previene che due processi thread eseguano contemporaneamente lo stesso metodo;
    public synchronized boolean removeFieldInt( int amount )
    {
        if( fieldInt < amount )
        {
            return false;
        }
        fieldInt -= amount;
        return true;
    }

    // "synchronized" previene che due processi thread eseguano contemporaneamente lo stesso metodo;
    public synchronized int getFieldInt()
    {
        return fieldInt;
    }
}