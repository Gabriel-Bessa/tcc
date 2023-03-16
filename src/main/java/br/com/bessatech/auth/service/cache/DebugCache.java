package br.com.bessatech.auth.service.cache;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class DebugCache implements BasicCache {

    private final Long expirationTime = 1000L;

}
