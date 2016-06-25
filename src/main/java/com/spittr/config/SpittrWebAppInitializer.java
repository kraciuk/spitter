package com.spittr.config;

import com.pkraciuk.mvc.RootConfig;
import com.pkraciuk.mvc.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Piotr on 25/06/2016.
 */

//configuration of dispatcher servlet and spring application context
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    //default request path
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    /**
     *  Get classes responsible for configuring get application context created by ContextLoaderListener.
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }


    /**
     *  Get beans for DispatcherServlet's application context.
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }
}
