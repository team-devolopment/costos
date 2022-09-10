package co.gov.mintic.costos.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "enterprises")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enterprise")
    private long idEnterprise;

    @Column(name = "name")
    private String name;

    @Column(name= "document")
    private String document;

    @Column (name = "address")
    private String address;

    @Column(name = "create_at")
    private LocalDate createdAT;

    @Column(name = "update_at")
    private LocalDate updateAT;
}
