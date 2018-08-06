package com.journaldev.singleton;

public class Driver {
	public static void main (String [] args)
	{
		EagerInitializedSingleton  instance  = new EagerInitializedSingleton ();
		EagerInitializedSingleton instance2  = new EagerInitializedSingleton ();
	
		
		
		System.out.println(instance.hashCode());
		System.out.println(instance.hashCode());
		System.out.println(LazyInitializedSingleton.getInstance().hashCode());
		
	
	}

}
