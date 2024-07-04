package com.example.prova2024.Service;

import com.example.prova2024.Entity.Carro;
import com.example.prova2024.Repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CarroService {
    @Autowired
    CarroRepository carroRepository;

    public Carro cadastrarCarro(Carro carro) {
        carroRepository.save(carro);
        return carro;
    }

    public List<Carro> buscarCarro() {
        return carroRepository.findAll();
    }

    public Carro update(Carro carro) {
        return carroRepository.save(carro);
    }

    public void delete(Long id) {
        carroRepository.deleteById(id);
    }
}
