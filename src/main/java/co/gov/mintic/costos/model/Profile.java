package co.gov.mintic.costos.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profile")
    private long idProfile;

    @Column(name = "image")
    private String image;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "created_at")
    private LocalDate createdAT;

    @Column(name = "update_at")
    private LocalDate updateAT;
}
