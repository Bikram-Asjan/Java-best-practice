package com.bik;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CacheTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		Constructor cons = Cache.class.getDeclaredConstructor();
		cons.setAccessible(true);
		//Cache c1 = (Cache) cons.newInstance();
		Cache c2 = Cache.getInstance();
		Cache c3 = Cache.getInstance();
		//System.out.println("c1 == c2  " + (c1 == c2));
		System.out.println("c2 == c3  " + (c2 == c3));
		
		// creation of object by clonning
		//Cache c4 = (Cache)c2.clone();
		//System.out.println("c2 == c4  "+(c2 == c4));
		
	}

}
