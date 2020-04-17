package com.all.content.xmljdbcdaoexample.xmljdbcdaoexampledemo;



public class XmlJdbcExample {
	private String jdbc;   
	


private static XmlJdbcExample xjdbcService = new XmlJdbcExample();
	 
	
	private XmlJdbcExample() {}
	  
	  public static XmlJdbcExample createInstance() {
		    return  xjdbcService;
		  }

public String getJdbc() {
	
	
	return jdbc;
}
	
public void setJdbc(String jdbc) {
	this.jdbc = jdbc;
}
	


}
