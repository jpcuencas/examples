package com.boraji.tutorial.spring.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.boraji.tutorial.spring.controller")
public class MvcWebConfig implements WebMvcConfigurer {

   @Override
   public void configureViewResolvers(ViewResolverRegistry registry) {
      registry.jsp("/WEB-INF/views/", ".jsp");
   }

   /**
    * Static Resource (CSS or JS) mapping
    */
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {

      // Register resource handler for CSS and JS
      registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/statics/", "D:/statics/")
            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());

      // Register resource handler for images

      registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/")
            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
   }
}
