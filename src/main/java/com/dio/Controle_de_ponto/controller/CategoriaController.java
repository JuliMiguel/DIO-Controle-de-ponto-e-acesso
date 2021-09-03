package com.dio.Controle_de_ponto.controller;

;
import com.dio.Controle_de_ponto.Service.CategoriaService;
import com.dio.Controle_de_ponto.model.CategoriaUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping
    public CategoriaUsuario createCategoria(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaService.saveCategoria(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getCategoriaList(){
        return categoriaService.findAll();
    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> getCategoriaByID(@PathVariable("idCategoria") Long idCategoria) throws Exception {
        return ResponseEntity.ok(categoriaService.getById(idCategoria).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public CategoriaUsuario updateCategoria(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaService.updateCategoria(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoria}")
    public ResponseEntity deleteByID(@PathVariable("idCategoria") Long idCategoria) throws Exception {
        try {
            categoriaService.deleteCategoria(idCategoria);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();
    }
}
