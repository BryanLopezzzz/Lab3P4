package org.example.lab31.presentation.polizas;

import org.example.lab31.logic.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller("polizas")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/presentation/polizas/show")
    public String show(@RequestParam String identificacion, Model model) {
        model.addAttribute("polizas", service.polizaFindByCliente(identificacion));
        model.addAttribute("identificacion", identificacion);
        return "/presentation/polizas/View";
    }
}