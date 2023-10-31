package br.com.nicollas.calculate.controller;


import br.com.nicollas.calculate.model.ErrorCalc;
import br.com.nicollas.calculate.model.Resultado;
import br.com.nicollas.calculate.model.Usuario;
import br.com.nicollas.calculate.services.MassCalcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RestController
@RequestMapping("api/v1/calculate")
public class CalculateMassController {

    @Autowired
    private MassCalcService massCalcService;

    @ResponseStatus(OK)
    @GetMapping("/mass")
    public ResponseEntity<String> calc() {
        log.info("calculating mass...");

        return ResponseEntity.ok("OK");
    }

    @ResponseStatus(OK)
    @PostMapping("/calc")
    public ResponseEntity<?> createUser(@RequestBody Usuario usuario) {
        log.info("calculating mass...");

        Resultado resultado = null;
        try {
            resultado = massCalcService.calcMass(usuario);

            return ResponseEntity.ok(resultado);
        } catch (Exception e) {
            ErrorCalc errorCalc = new ErrorCalc(usuario);
            errorCalc.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(errorCalc);
        }


    }



}
