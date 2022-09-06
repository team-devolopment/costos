package co.gov.mintic.costos.service;

import co.gov.mintic.costos.model.Enterprise;

import java.util.List;

public interface IEnterpriseService {

    public Enterprise findById(long id);

    public List<Enterprise> findByAll();

    public Enterprise createEnterprise(Enterprise enterprise);

    public Enterprise updateEnterprise(long id, Enterprise enterprise);

    public void deleteEnterprise(long id);
}
