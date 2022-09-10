package co.gov.mintic.costos.service;

import co.gov.mintic.costos.model.Enterprise;
import co.gov.mintic.costos.repository.IEnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService implements  IEnterpriseService{

    @Autowired
    private IEnterpriseRepository enterpriseRepository;

    @Override
    public Enterprise findById(long id) {
        Optional<Enterprise> enterprise = enterpriseRepository.findById(id);
        return enterprise.get();
    }

//    Funciona modificando el metodo adstrato de la interfaz
//    @Override
//    public Optional<Enterprise> findById(long id) {
//        return this.enterpriseRepository.findById(id);
//    }

//    Funciona con JPArepository sin castear
//    @Override
//    public List<Enterprise> findAll(long id) {
//        return this.enterpriseRepository.findById(id);
//    }
    @Override
    public List<Enterprise> findAll() {
        return (List<Enterprise>) this.enterpriseRepository.findAll();
    }

    @Override
    public Enterprise createEnterprise(Enterprise enterprise) {
        enterprise.setCreatedAT(LocalDate.now());
        Enterprise postEnterprise = enterpriseRepository.save(enterprise);
        return postEnterprise;
//      return this.enterpriseRepository.save(enterprise);   //Forma resumida
    }
    @Override
    public Enterprise updateEnterprise(long id, Enterprise enterprise) {
        enterprise.setUpdateAT(LocalDate.now());
        Enterprise putEnterprise = enterpriseRepository.save(enterprise);
        return putEnterprise;
    }
    @Override
    public void deleteEnterprise(long id) {
        enterpriseRepository.deleteById(id);
    }
}
