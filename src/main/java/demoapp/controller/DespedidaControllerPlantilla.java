package demoapp.controller;

import demoapp.service.DespedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DespedidaControllerPlantilla {

    private final DespedidaService service;

    @Autowired
    public DespedidaControllerPlantilla(DespedidaService service) {
        this.service = service;
    }

    @RequestMapping("/despedidaH1/{nombre}")
    public String saludo(@PathVariable(value="nombre") String nombre, Model model) {
        // Se añade la respuesta a la clave 'mensaje' que se usa
        // en la plantilla
        model.addAttribute("mensaje", service.despedida(nombre));
        // Se llama a la plantilla 'saludo.html'
        return "despedida";
    }
}