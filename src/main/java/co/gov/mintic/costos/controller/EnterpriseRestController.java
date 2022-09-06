package co.gov.mintic.costos.controller;

import co.gov.mintic.costos.model.Enterprise;
import co.gov.mintic.costos.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EnterpriseRestController {

    @Autowired
    private IEnterpriseService enterpriseService;

    @GetMapping("/enterprise/{id}")
    public Enterprise findById(@PathVariable long id) {
        return this.enterpriseService.findById(id);
    }

    @GetMapping("/enterprise")
    public List<Enterprise> findByAll() {
        return this.enterpriseService.findByAll();
    }

    @PostMapping("/enterprise")
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise) {
        return this.enterpriseService.createEnterprise(enterprise);
    }

    @PutMapping("/enterprise/{id}")
    public Enterprise UpdateEnterprise(@PathVariable long id, @RequestBody Enterprise enterprise) {
        return this.enterpriseService.updateEnterprise(id,enterprise);
    }
    @DeleteMapping("/enterprise/{id}")
    public void deleteEnterprise(@PathVariable long id) {
        this.enterpriseService.deleteEnterprise(id);
    }


}






