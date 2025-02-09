/**
 * 
 */
package com.jonathan_K.SpringBoot_learning_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @author JONATHAN
 */
@Service
//@PropertySource("classpath:custom.properties") // reads from outside files, specify class path(handles a single file)
@PropertySources({
    @PropertySource("classpath:custom.properties"),
    @PropertySource("classpath:custom2.properties")
})
public class MyFirstService {

    //read from custom files .properties
    @Value("${my.prop}")
    private String readFromcustomPropertyFile;
   //
    @Value("${my.prop.2}")
    private String readFromcustomPropertyFile2;
    
    private final MyFirstClass myfirstclass;
    //special bean used to read system properties and app property
    private Environment environment;
    
    /**
     * @param myfirstclass
     */
    //@Autowired
    public MyFirstService(MyFirstClass myfirstclass) {
	
	this.myfirstclass = myfirstclass;
    }
    
//
    public String tellStory() {
	return "The girl is saying : "+myfirstclass.SayHello();
    }

    public String getJavaVersion() {
	return environment.getProperty("java.version");
    }
    
    public String getOperatingSystemName() {
	return environment.getProperty("os.name");
    }
    
    /*
     * public String readPropert() { return
     * environment.getProperty("my.custom.property"); }
     */
    /**
     * @return the environment
     */
    public Environment getEnvironment() {
	return environment;
    }

    /**
     * @param environment the environment to set
     */
    @Autowired
    public void setEnvironment(Environment environment) {
	this.environment = environment;
    }

    /**
     * @return the readFromcustomPropertyFile
     */
    public String getReadFromcustomPropertyFile() {
	return readFromcustomPropertyFile;
    }

    /**
     * @param readFromcustomPropertyFile the readFromcustomPropertyFile to set
     */
    public void setReadFromcustomPropertyFile(String readFromcustomPropertyFile) {
	this.readFromcustomPropertyFile = readFromcustomPropertyFile;
    }

    /**
     * @return the readFromcustomPropertyFile2
     */
    public String getReadFromcustomPropertyFile2() {
	return readFromcustomPropertyFile2;
    }

    /**
     * @param readFromcustomPropertyFile2 the readFromcustomPropertyFile2 to set
     */
    public void setReadFromcustomPropertyFile2(String readFromcustomPropertyFile2) {
	this.readFromcustomPropertyFile2 = readFromcustomPropertyFile2;
    }
}
