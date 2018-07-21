package com.configuration;

import com.POJO.Countries;
import com.POJO.NaturalResources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com")
@EnableWebMvc
public class ConfigurationJavaBased {

    @Bean
    public Countries getCountries(){
        Countries countries=new Countries();
        countries.setName("INDIA");
        NaturalResources naturalResources=new NaturalResources();
        countries.setNaturalResources(naturalResources);
        countries.setNumberOfStates(29);
        return countries;

    }
}
