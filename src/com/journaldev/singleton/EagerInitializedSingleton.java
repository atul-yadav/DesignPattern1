package com.journaldev.singleton;

public class EagerInitializedSingleton {
   
   private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
   
   //private constructor to avoid client applications to use constructor
   EagerInitializedSingleton(){}

   public static EagerInitializedSingleton getInstance(){
       return instance;
   }
}
