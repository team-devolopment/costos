package co.gov.mintic.costos.service;



import co.gov.mintic.costos.model.Profile;
import co.gov.mintic.costos.repository.IProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileService implements IProfileService {
    @Autowired
    private IProfileRepository profileRepository;
    @Override
    public Profile findById(long id) {
        Optional<Profile> profile = profileRepository.findById(id);
        return profile.get();
    }
    @Override
    public List<Profile> findAll() {
        return (List<Profile>) this.profileRepository.findAll();
    }

    @Override
    public Profile createProfile(Profile profile) {
        profile.setCreatedAT(LocalDate.now());
        Profile postProfile = this.profileRepository.save(profile);
        return postProfile;
    }

    @Override
    public Profile updateProfile(long id, Profile profile) {
        profile.setUpdateAT(LocalDate.now());
        Profile putProfile = profileRepository.save(profile);
        return putProfile;
    }

    @Override
    public boolean deleteProfile(long id) {
        try {
            profileRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
