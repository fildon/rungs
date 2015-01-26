package com.softwire.rungs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.softwire.rungs")
public class RungsConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }

    @Bean
    public MappingJackson2HttpMessageConverter jsonMessageConverter(){
        return new MappingJackson2HttpMessageConverter();
    }

    @Bean
    public RequestMappingHandlerAdapter messageConverters(){
        RequestMappingHandlerAdapter messageConverters = new RequestMappingHandlerAdapter();
        messageConverters.setMessageConverters(new ArrayList<HttpMessageConverter<?>>(
                Arrays.asList(jsonMessageConverter())));
        return messageConverters;
    }
}
