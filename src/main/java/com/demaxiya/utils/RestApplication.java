package com.demaxiya.utils;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

//import com.nico.entities.PagerEx;

/**
 * Registers the components to be used by the JAX-RS application  
 */
public class RestApplication extends ResourceConfig {
	// 注册JAX-RS应用组件
	public RestApplication(){
		//服务类所在的包路径  
	    packages("com.demaxiya.service");
	    
		register(RequestContextFilter.class);	// System
		register(JacksonFeature.class);			// System
		register(JacksonJsonProvider.class);	// System
		register(LoggingFilter.class);			// Log
	}
}
