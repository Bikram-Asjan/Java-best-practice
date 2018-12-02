package com.bik;

public abstract class Cache extends AppBase{
	private static Cache instance;

	private Cache() {
		// no argument constructor
	}

	public static Cache getInstance() {
		if (instance == null) {
			synchronized (Cache.class) {
				// double checking technique
				if (instance == null) {
					instance = new Cache() {
					}; // inner class concept to create the abstract class
						// object
				}
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("clone is not supported");
	
	}
	public Object readResolve(){
		return instance;
	}
	
}
