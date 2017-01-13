package com.fabrice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration 
@ComponentScan("com.fabrice") 
@Import(DBConfig.class)
@EnableWebMvc   
public class AppConfig extends WebMvcConfigurerAdapter  {  
	    
		@Override
		public void configureViewResolvers(ViewResolverRegistry registry) {
			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
			viewResolver.setPrefix("/WEB-INF/views/");
			viewResolver.setSuffix(".jsp");
			registry.viewResolver(viewResolver);
		}
	    
	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    	registry.addResourceHandler("/app-resources/**").addResourceLocations("/resources/");
	    	registry.addResourceHandler("/static/**").addResourceLocations("/static");
	 
	    }   
	    
	    @Override
	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }

}
