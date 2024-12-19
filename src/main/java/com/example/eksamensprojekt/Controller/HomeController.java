package com.example.eksamensprojekt.Controller;
import com.example.eksamensprojekt.Service.BilService;
import com.example.eksamensprojekt.Service.LejeaftaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    @Autowired
    BilService bilService;
    @Autowired
    LejeaftaleService lejeaftaleService;

    @GetMapping("/")
    public String homePage(Model model) {

        return "home/forside";
    }


}
