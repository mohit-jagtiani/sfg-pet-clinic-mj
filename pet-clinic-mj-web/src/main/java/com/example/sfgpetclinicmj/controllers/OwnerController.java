package com.example.sfgpetclinicmj.controllers;

import com.example.sfgpetclinicmj.model.Owner;
import com.example.sfgpetclinicmj.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index.html", "/index"})
    public String listOwners(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

}
