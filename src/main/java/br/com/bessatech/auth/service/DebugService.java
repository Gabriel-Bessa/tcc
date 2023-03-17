package br.com.bessatech.auth.service;

import br.com.bessatech.auth.service.cache.DebugCache;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Service
@RequiredArgsConstructor
public class DebugService {

    private final DebugCache cache;

    public Map<String, String> getKey(String key) {
        return cache.get(key);
    }

    public void setKey(String key, HashMap<String, String> obj) {
        cache.put(key, obj);
    }
}
