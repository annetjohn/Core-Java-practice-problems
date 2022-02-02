package com.n2s.SpringXMLConfig2;

import org.springframework.stereotype.Component;

@Component
public class Coffee implements Beverages{

	//inside the class creating a method as we always do
	public void drink() {
		System.out.println("I am drinking coffee.");
	}
}
