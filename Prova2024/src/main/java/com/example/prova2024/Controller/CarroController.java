package com.example.prova2024.Controller;

import com.example.prova2024.Entity.Carro;
import com.example.prova2024.Service.CarroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("carro")

public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping("/cadastrar")
    public String cadastrarCarro(@RequestBody @Valid Carro carro) {
        carroService.cadastrarCarro(carro);
        return " cadastrato com sucesso";
    }

    @GetMapping("buscar")
    public List<Carro> buscarCarro() {
        return carroService.buscarCarro();
    }

    @PutMapping("atualizar")
    public Carro atualizarCarro(@RequestBody Carro carro) {
        return carroService.update(carro);
    }

    @DeleteMapping("apagar/{id}")
    public String apagarCarro(@PathVariable Long id) {
        carroService.delete(id);
        return "excluido com susseso";
    }



}
