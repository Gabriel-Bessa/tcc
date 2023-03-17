package br.com.bessatech.auth.service.cache;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Slf4j
@Configuration
@NoArgsConstructor
public class DebugCache {

    @CachePut(value = CacheConstants.DEBUG, key = "#key", cacheManager = CacheConstants.DEBUG_CACHE_MANAGER)
    public HashMap<String, String> put(String key, HashMap<String, String> value) {
        log.debug("Adding information to the registration cache permissions {}", key);
        return value;
    }

    @Cacheable(value = CacheConstants.DEBUG, key = "#key", cacheManager = CacheConstants.DEBUG_CACHE_MANAGER)
    public HashMap<String, String> get(String key) {
        log.debug("Rescuing information to the registration cache permissions {}", key);
        return null;
    }

    @CacheEvict(value = CacheConstants.DEBUG, key = "#key", cacheManager = CacheConstants.DEBUG_CACHE_MANAGER)
    public void delete(String key) {
        log.debug("Remove information to changing password of user {}", key);
    }

}
