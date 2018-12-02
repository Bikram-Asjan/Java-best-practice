package com.bik;

import java.io.Serializable;

public class AppBase implements Cloneable, Serializable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
