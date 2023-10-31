package br.com.nicollas.calculate.controller;


import br.com.nicollas.calculate.model.ErrorCalc;
import br.com.nicollas.calculate.model.Usuario;
import br.com.nicollas.calculate.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    @ResponseStatus(OK)
    @GetMapping
    public ResponseEntity<List<Usuario>> listUsers() {

        List<Usuario> users = usuarioRepository.findAll();

        return ResponseEntity.ok(users);
    }

    @ResponseStatus(OK)
    @GetMapping("/{name}")
    public ResponseEntity<?> getUserByName(@PathVariable String name) {

        Usuario user = usuarioRepository.findByName(name);
        if (user == null){
            ErrorCalc errorCalc = new ErrorCalc();
            String message = String.format("Usuario com o nome %s nao encontrado!!", name);
            errorCalc.setMessage(message);
            return ResponseEntity.badRequest().body(errorCalc);
        }


        return ResponseEntity.ok(user);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public ResponseEntity<Usuario> createUser(@RequestBody Usuario user) {

        Usuario saved = usuarioRepository.save(user);

        return ResponseEntity.ok(saved);
    }

    @ResponseStatus(OK)
    @PutMapping(value = "/{id}")
    public ResponseEntity<Usuario> update(@RequestParam Usuario user){



        return new ResponseEntity<Usuario>(user, HttpStatus.OK);
    }

    @ResponseStatus(OK)
    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> delete(@RequestParam Usuario user){
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
