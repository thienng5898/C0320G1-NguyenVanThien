package com.example.demoormcustomer.config;

//import com.example.demoormcustomer.formatter.ProvinceFormatter;
import com.example.demoormcustomer.services.ProvinceService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class ApplicationConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {

    ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext= applicationContext;
    }

}