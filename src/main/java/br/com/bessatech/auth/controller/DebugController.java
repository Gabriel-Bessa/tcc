package br.com.bessatech.auth.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/teste")
public class DebugController {

    @GetMapping("/{key}")
    public Object teste(@PathVariable String key) {
        return new Object();
    }

    @PostMapping("/{key}")
    public Object testesa(@PathVariable String key, @RequestBody Object obj) {
        return new Object();
    }

}