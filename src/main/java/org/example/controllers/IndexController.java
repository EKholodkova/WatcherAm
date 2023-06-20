package org.example.controllers;

import org.example.dao.InterruptionCaseDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/interruptions")
public class IndexController {

    private final InterruptionCaseDAO interruptionCaseDAO;

    public IndexController(InterruptionCaseDAO interruptionCaseDAO) {
        this.interruptionCaseDAO = interruptionCaseDAO;
    }

    @GetMapping("/index")
    public String getIndex(ModelMap model) {
        model.addAttribute("plannedInterruptions", interruptionCaseDAO.getPlanned());
        model.addAttribute("emergencyInterruptions", interruptionCaseDAO.getEmergency());
        return "index copy";
    }
}
