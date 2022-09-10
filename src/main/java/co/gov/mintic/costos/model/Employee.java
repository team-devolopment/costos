package co.gov.mintic.costos.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private long idEmployee;

    @Column(name = "email", unique = true)
    private String email;

    @OneToOne
    @JoinColumn(name = "id_profile")
    private Profile profile;

    @Enumerated(EnumType.STRING)
    private RoleName roleName;

//    @ManyToOne
//    @JoinColumn(name = "id_enterprise")
//    private Enterprise enterprice;

    @Column(name = "create_at")
    private LocalDate createdAT;

    @Column(name = "update_at")
    private LocalDate updateAT;


}