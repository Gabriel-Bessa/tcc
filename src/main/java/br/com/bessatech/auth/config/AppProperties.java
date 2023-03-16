package br.com.bessatech.auth.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {

    @Component
    @ConfigurationProperties
    @PropertySource(value = "classpath:application.yaml")
    public static class RedisConnect {

        @Value("${spring.data.redis.host}")
        public String redisUrl;

        @Value("${spring.data.redis.port}")
        public Integer redisPort;

        @Value("${spring.data.redis.password}")
        public String redisPass;
    }
}