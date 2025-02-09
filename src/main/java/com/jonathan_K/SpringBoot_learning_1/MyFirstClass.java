/**
 * 
 */
package com.jonathan_K.SpringBoot_learning_1;

/**
 * @author JONATHAN
 */
//@Service
public class MyFirstClass {

    private String myVar;
     
    /**
     * @param myVar
     */
    public MyFirstClass(String myVar) {
	this.myVar = myVar;
    }

    public String SayHello() {
	return "Hello Jonathan  ==> myVar = "+myVar;
    }
}
