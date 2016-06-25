package com.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Piotr on 25/06/2016.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.spittr.web")
public class WebConfig extends WebMvcConfigurerAdapter {

}
