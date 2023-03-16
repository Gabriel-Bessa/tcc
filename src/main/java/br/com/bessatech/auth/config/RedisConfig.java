package br.com.bessatech.auth.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RedisConfig {

    private final AppProperties.RedisConnect redisConnect;

    @Bean
    public JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration(redisConnect.redisUrl, redisConnect.redisPort);
        config.setPassword(redisConnect.redisPass);
        return new JedisConnectionFactory(config);
    }

}
