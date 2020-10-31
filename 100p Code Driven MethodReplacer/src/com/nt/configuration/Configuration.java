package com.nt.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@org.springframework.context.annotation.Configuration
@ImportResource("com/nt/cfgs/applicationContext.xml")
@ComponentScan(basePackages = "com.nt.replacer")
public class Configuration {

}
