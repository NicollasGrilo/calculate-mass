package br.com.nicollas.calculate.controller;


import br.com.nicollas.calculate.model.Resultado;
import br.com.nicollas.calculate.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @ResponseStatus(OK)
    @PostMapping("/calc")
    public ResponseEntity<Resultado> createUser(@RequestBody Usuario usuario) {
        log.info("calculating mass...");

        Resultado resultado = new Resultado();
        resultado.setMass(200);
        resultado.setName(usuario.getName());

        return ResponseEntity.ok(resultado);
    }

}
