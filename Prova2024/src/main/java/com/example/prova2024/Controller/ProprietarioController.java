package com.example.prova2024.Controller;

import com.example.prova2024.Entity.Proprietario;
import com.example.prova2024.Service.ProprietarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("proprietario")
public class ProprietarioController {

    @Autowired
    private ProprietarioService proprietarioService;

    @PostMapping("/cadastrar")
    public String cadastrarProprietario(@RequestBody @Valid Proprietario proprietario) {
        proprietarioService.cadastrarProprietario(proprietario);
        return "Proprietario cadastrato com sucesso";
    }

    @GetMapping("buscar")
    public List<Proprietario> buscarProprietario() {
        return proprietarioService.buscarProprietario();
    }

    @PutMapping("atualizar")
    public Proprietario atualizarProprietario(@RequestBody Proprietario proprietario) {
        return proprietarioService.update(proprietario);
    }

    @DeleteMapping("apagar/{id}")
    public String apagarProprietario(@PathVariable Long id) {
        proprietarioService.delete(id);
        return "excluido com susseso";
    }




}
