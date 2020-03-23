package mvcrestdto.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @RequestMapping("/company")
    String companies() {
        return "Company";
    }
}
