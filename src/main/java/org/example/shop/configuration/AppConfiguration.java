package org.example.shop.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableCaching
@Import({SoapConfiguration.class})
public class AppConfiguration {



}
