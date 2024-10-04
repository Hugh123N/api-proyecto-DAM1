package com.api.api.controller;

import com.api.api.dto.UsuarioDTO;
import com.api.api.model.Usuario;
import com.api.api.service.IUsuarioService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@NoArgsConstructor
@RestController
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

/** + enter
 *
 * Consultar => GET
 * Guardar => POST
 * Actualizar => PUT(*) / PATCH
 * Eliminar => DELETE
 */
    @GetMapping("/usuarios")
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }
    @GetMapping("/{id}")
    public Usuario findById(@PathVariable Integer id){
        return usuarioService.findById(id);
    }
    @PostMapping("/save")
    public Usuario save( @RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }
    @PutMapping("/update/{id}")
    public Usuario update(@RequestBody UsuarioDTO u, @PathVariable Integer id){
        return usuarioService.update(u,id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        usuarioService.delete(id);
    }

}
