package com.iacc.tarea3.controller;

import com.iacc.tarea3.model.Caso;
import com.iacc.tarea3.service.ICasoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/views/casos")
public class CasoController {

    @Autowired
    private ICasoService casoService;

    @GetMapping("/")
    public String listarClientes(Model model){
        List<Caso> listadoCasos = casoService.listarTodos();

        model.addAttribute("titulo", "Lista de casos");
        model.addAttribute("casos", listadoCasos);
        return "/views/casos/listar";
    }

    @GetMapping("/crear")
    public String crear(Model model) {
        Caso caso = new Caso();

        model.addAttribute("titulo", "Crear caso");
        model.addAttribute("caso", caso);

        return "/views/casos/crear";
    }

    @PostMapping("/save")
    public String guardar(@ModelAttribute Caso caso) {
        casoService.guardar(caso);
        return "redirect:/views/casos/";
    }

    @GetMapping("/edit/{id}")
    public String editar(@PathVariable("id") Integer idCaso, Model model) {
        Caso caso = casoService.buscarPorId(idCaso);
        model.addAttribute("caso", caso);

        return "/views/casos/crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminar(@PathVariable("id") Integer idCaso, Model model) {
        casoService.eliminar(idCaso);
        return "redirect:/views/casos/";
    }
}
