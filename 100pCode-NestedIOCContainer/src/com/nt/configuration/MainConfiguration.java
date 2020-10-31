package com.nt.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ControllerConfiguration.class,ServiceConfiguration.class,PersisitanceConfiguration.class})
public class MainConfiguration {

}
