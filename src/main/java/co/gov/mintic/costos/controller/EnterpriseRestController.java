package co.gov.mintic.costos.controller;

import co.gov.mintic.costos.model.Enterprise;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EnterpriseRestController {

    @GetMapping("/enterprise/{id}")
    public Enterprise findById(@PathVariable long id) {
        Enterprise enterprise = new Enterprise();
        enterprise.setId(1);
        enterprise.setName("Fabian");
        return enterprise;
    }

    @GetMapping("/enterprise")
    public List<Enterprise> findByAll() {
        List<Enterprise> list = new ArrayList<>();
        Enterprise enterprise1 = new Enterprise();
        Enterprise enterprise2 = new Enterprise();
        enterprise1.setId(1);
        enterprise1.setName("Fabian");
        enterprise1.setDocument("1113623674");
        enterprise2.setId(2);
        enterprise2.setName("Fabian");
        enterprise2.setDocument("1113623674");
        list.add(enterprise1);
        list.add(enterprise2);
        return list;
    }

    @PostMapping("/enterprise")
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise) {
        Enterprise newEnterprise = new Enterprise();
        newEnterprise.setId(3);
        newEnterprise.setName(enterprise.getName());
        newEnterprise.setDocument(enterprise.getDocument());
        return newEnterprise;
    }


    @PutMapping("/enterprise/{id}")
    public Enterprise UpdateEnterprise(@PathVariable long id, @RequestBody Enterprise enterprise) {
        Enterprise enterprise1 = findById(id);
        enterprise1.setId(enterprise.getId());
        enterprise1.setName(enterprise.getName());
        enterprise1.setDocument(enterprise.getDocument());
        return enterprise1;

    }

    @DeleteMapping("/enterprise/{id}")
    public void deleteEnterprise(@PathVariable long id){
        Enterprise enterprise = findById(id);
    }





}






