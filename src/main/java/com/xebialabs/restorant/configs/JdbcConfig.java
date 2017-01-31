package com.xebialabs.restorant.configs;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"withDb","embedded"})
@EnableAutoConfiguration
public class JdbcConfig {
}
