package br.com.nicollas.calculate.repository;

import br.com.nicollas.calculate.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
    Usuario findByName(String name);
}
