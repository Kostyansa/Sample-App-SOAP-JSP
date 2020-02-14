package org.example.shop.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@Import({SoapConfiguration.class, WebSecurityConfiguration.class})
@EnableCaching
@EnableWebMvc
public class AppConfiguration {



}
