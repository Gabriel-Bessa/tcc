package br.com.bessatech.auth.service;

import br.com.bessatech.auth.service.cache.DebugCache;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
@RequiredArgsConstructor
public class DebugService {

    private final DebugCache cache;

    public Object getKey() {
        return new Object();
    }

}
