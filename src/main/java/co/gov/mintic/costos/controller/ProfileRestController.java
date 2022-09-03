package co.gov.mintic.costos.controller;

import co.gov.mintic.costos.model.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfileRestController {

    @GetMapping("/profile/{id}")
    public Profile findById(@PathVariable long id) {
        Profile profile = new Profile();
        profile.setId(id);
        profile.setImage("lex1@hot");
        return profile;
    }

    @GetMapping("/profile")
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

    @PostMapping("/profile")
    public Profile createRol(@RequestBody Profile profile) {
        Profile newProfile = new Profile();
        newProfile.setId(3);
        newProfile.setImage(profile.getImage());
        return profile;
    }

    @PutMapping("/profile/{id}")
    public Profile updateEmployee(@PathVariable long id, @RequestBody Profile profile) {
        Profile putProfile = findById(id);
        putProfile.setId(3);
        putProfile.setImage(profile.getImage());
        return putProfile;
    }


    @DeleteMapping("/profile/{id}")
    public void deleteEmployee(@PathVariable int id) {
        Profile deleteEmployee = findById(id);
    }


}
