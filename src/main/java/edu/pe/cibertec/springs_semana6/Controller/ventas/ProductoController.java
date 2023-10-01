package edu.pe.cibertec.springs_semana6.Controller.ventas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ventas/producto")

public class ProductoController {
    @GetMapping("/frmproducto")
    public String frmproducto(Model model){
        return "ventas/producto";
    }
}
