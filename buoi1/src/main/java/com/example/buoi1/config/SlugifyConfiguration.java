package com.example.buoi1.config;

import com.github.slugify.Slugify;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SlugifyConfiguration {

    @Bean
    public Slugify slugify() {
        Slugify slugify = new Slugify();
        //config
        slugify.withTransliterator(true);
        return slugify;
    }

}
