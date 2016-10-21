package com.example;

import org.apache.catalina.Context;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

/*
	//This bean is added to set the cookies HttpOnly = false. It works (cookies aren't httpOnly) but
	// the flow doesn't work yet !!
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
		factory.setTomcatContextCustomizers(Arrays.asList(new CustomCustomizer()));
		return factory;
	}

	static class CustomCustomizer implements TomcatContextCustomizer {
		@Override
		public void customize(Context context) {
			context.setUseHttpOnly(false);
		}
	}
*/


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
