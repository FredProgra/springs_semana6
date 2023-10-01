package edu.pe.cibertec.springs_semana6.Controller.ventas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ventas/reportes")
@Controller

public class ReporteController {
    @GetMapping("/frmreportes")
    public String frmproducto(Model model){
        return "ventas/reportes";
    }

}
