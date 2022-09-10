package co.gov.mintic.costos.service;

import co.gov.mintic.costos.model.Enterprise;

import java.util.List;
import java.util.Optional;

public interface IEnterpriseService {

    public Enterprise findById(long id);

    public List<Enterprise> findAll();

    public Enterprise createEnterprise(Enterprise enterprise);

    public Enterprise updateEnterprise(long id, Enterprise enterprise);

    public void deleteEnterprise(long id);
}
