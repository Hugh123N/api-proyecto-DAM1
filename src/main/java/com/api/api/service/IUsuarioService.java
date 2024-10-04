package com.api.api.service;

import com.api.api.dto.UsuarioDTO;
import com.api.api.model.Usuario;

import java.util.List;

public interface IUsuarioService {
    //GET
    List<Usuario> findAll();
    Usuario findById(Integer id);
    //POST
    Usuario save(Usuario usuario);
    //put
    Usuario update(UsuarioDTO usuario, Integer id);
    //delete
    void delete(Integer id);
}
