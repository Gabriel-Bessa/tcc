package br.com.bessatech.auth.controller;

import br.com.bessatech.auth.service.DebugService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/teste")
public class DebugController {

    private final DebugService service;

    @GetMapping("/{key}")
    public Map<String, String> teste(@PathVariable String key) {
        return service.getKey(key);
    }

    @PostMapping("/{key}")
    public void testesa(@PathVariable String key, @RequestBody HashMap<String, String> obj) {
        service.setKey(key, obj);
    }

}
