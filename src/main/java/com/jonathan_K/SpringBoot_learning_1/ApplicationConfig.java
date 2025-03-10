/**
 * 
 */
package com.jonathan_K.SpringBoot_learning_1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author JONATHAN
 */

@Configuration
public class ApplicationConfig {

    @Bean()
  //  @Qualifier("bean1")
  MyFirstClass myFirstClass() {
	    return new MyFirstClass("i love you");
	}
    
    @Bean()
  //  @Qualifier("bean2")
    MyFirstClass mySecondClass() {
  	    return new MyFirstClass("Secong bean");
  	}
    
    @Bean()
    @Primary  // priotizes it
      MyFirstClass myThirdClass() {
    	    return new MyFirstClass("Third bean");
    	}
}
