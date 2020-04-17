package com.all.content.xmljdbcdaoexampledemo.car.info;

public class CarInformation implements Automobile{
	
	private String make = "Hyundai";
	private String model = "Sante Fe";
	private String year = "2004";

	@Override
	public String make() {
		// TODO Auto-generated method stub
		return make;
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String year() {
		// TODO Auto-generated method stub
		return year;
	}

	
}
