package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class DespedidaService {
    public String despedida(String nombre) {
        return "Chao " + nombre;
    }
}