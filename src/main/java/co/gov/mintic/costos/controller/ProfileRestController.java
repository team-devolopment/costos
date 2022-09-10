package co.gov.mintic.costos.controller;

import co.gov.mintic.costos.model.Profile;
import co.gov.mintic.costos.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfileRestController {

    @Autowired
    private IProfileService profileService;

    @GetMapping("/profile/{id}")
    public Profile findById(@PathVariable long id) {
        return this.profileService.findById(id);
    }

    @GetMapping("/profile")
    public List<Profile> findByAll() {
        return this.profileService.findAll();
    }

    @PostMapping("/profile")
    public Profile createRol(@RequestBody Profile profile) {
        return this.profileService.createProfile(profile);
    }

    @PutMapping("/profile/{id}")
    public Profile updateEmployee(@PathVariable long id, @RequestBody Profile profile) {
        return this.profileService.updateProfile(id, profile);
    }

    @DeleteMapping("/profile/{id}")
    public void deleteEmployee(@PathVariable int id) {
        this.profileService.deleteProfile(id);
    }
}
