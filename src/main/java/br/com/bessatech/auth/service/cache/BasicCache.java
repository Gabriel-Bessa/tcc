package br.com.bessatech.auth.service.cache;

import org.springframework.data.redis.core.RedisTemplate;

public interface BasicCache {

    Long getExpirationTime();

    default <T> T getByKey(String key) {
        RedisTemplate<String, T> template = new RedisTemplate<>();
        return template.opsForValue().get(key);
    }

    default <T> void putByKey(String key, T object) {
        RedisTemplate<String, T> template = new RedisTemplate<>();
        template.opsForValue().set(key, object, getExpirationTime());
    }
}
