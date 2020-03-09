package com.xiaoyan.chatbot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.ArrayList;


/**
 * cors跨域解决
 */
@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter(){

        CorsConfiguration config = new CorsConfiguration();

        ArrayList<String> urls = new ArrayList<>();

        // * cookie is not allowed
        urls.add("*");

        config.setAllowedOrigins(urls);
        config.addAllowedMethod("*");
        config.addAllowedHeader("*");

        //是否发送cookie
        config.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**",config);

        return new CorsFilter(configurationSource);
    }
}
