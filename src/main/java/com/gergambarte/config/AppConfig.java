package com.gergambarte.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.gergambarte.Computer;
import com.gergambarte.Desktop;
import com.gergambarte.Developer;
import com.gergambarte.Laptop;

@Configuration
@ComponentScan("com.gergambarte")
public class AppConfig {
  // @Bean
  // public Developer developer(Computer com) {
  //   return new Developer(27, com);
  // }

  // @Bean
  // public Desktop desktop() {
  //   return new Desktop();
  // }

  // @Bean
  // @Primary
  // public Laptop laptop() {
  //   return new Laptop();
  // }

}
