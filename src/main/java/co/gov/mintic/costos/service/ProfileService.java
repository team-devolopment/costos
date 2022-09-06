package co.gov.mintic.costos.service;

import co.gov.mintic.costos.model.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService implements IProfileService {
    @Override
    public Profile findById(long id) {
        Profile profile = new Profile();
        profile.setId(id);
        profile.setImage("lex1@hot");
        return profile;
    }

    @Override
    public List<Profile> findByAll() {
        List<Profile> listProfiles = new ArrayList<>();
        Profile profile1 = new Profile();
        profile1.setId(1);
        profile1.setImage("lex1@hot");
        Profile profile2 = new Profile();
        profile2.setId(2);
        profile2.setImage("lex2@hot");
        listProfiles.add(profile1);
        listProfiles.add(profile2);
        return listProfiles;
    }

    @Override
    public Profile createProfile(Profile profile) {
        Profile newProfile = new Profile();
        newProfile.setId(3);
        newProfile.setImage(profile.getImage());
        return newProfile;
    }

    @Override
    public Profile updateProfile(long id, Profile profile) {
        Profile putProfile = findById(id);
        putProfile.setId(3);
        putProfile.setImage(profile.getImage());
        return putProfile;
    }

    @Override
    public void deleteProfile(long id) {
        Profile deleteEmployee = findById(id);
    }
}
