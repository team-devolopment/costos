package co.gov.mintic.costos.service;

import co.gov.mintic.costos.model.Profile;

import java.util.List;

public interface IProfileService {

    public Profile findById(long id);

    public List<Profile> findByAll();

    public Profile createProfile(Profile profile);

    public Profile updateProfile(long id, Profile profile);

    public void deleteProfile(long id);
}
