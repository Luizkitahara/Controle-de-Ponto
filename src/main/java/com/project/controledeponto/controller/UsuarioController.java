package com.project.controledeponto.controller;

import com.project.controledeponto.model.Usuario;
import com.project.controledeponto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }
    @GetMapping
    public List<Usuario> getUsuarioList() {
        return usuarioService.findAll();
    }
    @GetMapping("/{idUsuario}")
    public java.util.Optional<Usuario> getUsuarioById(@PathVariable("idUsuario") Long idUsuario) {
        return usuarioService.getById(idUsuario);
    }
    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(usuario);
    }
    @DeleteMapping("/{idUsuario}")
    public void deleteByID(@PathVariable("idUsuario") Long idUsuario) {
        usuarioService.deleteUsuario(idUsuario);
    }
}