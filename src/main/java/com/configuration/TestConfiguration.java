package com.configuration;

import com.POJO.Countries;
import com.POJO.NaturalResources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan(basePackages = "com",excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Configuration.class))
@EnableWebMvc
public class TestConfiguration {

    @Bean
    public Countries getCountries(){
        Countries countries=new Countries();
        countries.setName("RUSSIA");
        NaturalResources naturalResources=new NaturalResources();
        countries.setNaturalResources(naturalResources);
        countries.setNumberOfStates(29);
        return countries;

    }
}
