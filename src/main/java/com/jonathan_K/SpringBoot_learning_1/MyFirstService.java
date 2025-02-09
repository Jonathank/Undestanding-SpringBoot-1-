/**
 * 
 */
package com.jonathan_K.SpringBoot_learning_1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author JONATHAN
 */
@Service
public class MyFirstService {

    private final MyFirstClass myfirstclass;
    
    /**
     * @param myfirstclass
     */
    //@Autowired
    public MyFirstService(@Qualifier("bean2")MyFirstClass myfirstclass) {
	
	this.myfirstclass = myfirstclass;
    }


    public String tellStory() {
	return "The girl is saying : "+myfirstclass.SayHello();
    }
}
