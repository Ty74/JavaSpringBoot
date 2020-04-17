package com.all.content.xmljdbcdaoexample.xmljdbcdaoexampledemo;




public class XDAO {


	private String name;
/*
 * what I have learned is that the application context fails when trying to use an instantiated object from a
 * constructor.It fails everytime with an error. However, if primitive types are used with getters and setters.
 *, it will populate the value if the those are used to call and retrieve the value. Additionally, the attribute
 * "yourInstanceVariableName" is used to create the getters and setters. Also, the name is used to define the property
 * attribute within the applicationContext.xml file. The bean in the applicationContext.xml file should be set up 
 * like this: 
 * 
 * <bean id="xdaoService" class="com.xmljdbcdaoexample.xmljdbcdaoexampledemo.XDAO">
         <property name="name" value="Mr. Tulloch"></property>
    <!-- collaborators and configuration for this bean go here -->
  </bean>
 * 
 *  The Id should exemplify the class's name. The property name should be the name of the instance variable
 *  The value will appear if that class is called through a getter and nothing stored in it:the value added to the
 *  xml file will be printed. Printing an object alone
 *  will show something like this com.xmljdbcdaoexample.xmljdbcdaoexampledemo.XDAO@c273d3. 
 * */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
