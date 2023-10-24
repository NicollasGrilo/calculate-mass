package br.com.nicollas.calculate.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/calculate")
public class CalculateMassController {

    @ResponseStatus(OK)
    @GetMapping("/mass")
    public ResponseEntity<String> calc() {
        log.info("calculating mass...");

        return ResponseEntity.ok("OK");
    }

}
