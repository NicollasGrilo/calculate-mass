package br.com.nicollas.calculate.services;

import br.com.nicollas.calculate.model.Resultado;
import br.com.nicollas.calculate.model.Usuario;
import br.com.nicollas.calculate.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MassCalcService {

    private UsuarioRepository usuarioRepository;


    public MassCalcService(@Autowired UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public Resultado calcMass(Usuario usuario) throws Exception {
        Usuario byName = usuarioRepository.findByName(usuario.getName());
        if (byName == null)
            throw new Exception("Usuario nao existe");

        Resultado resultado = new Resultado();
        resultado.setName(byName.getName());
        resultado.setMass(20);

        return resultado;
    }

}
