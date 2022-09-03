package co.gov.mintic.costos.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Profile {

    private long id;
    private String image;
    private String phone;
    private Employee employee;
    private Date createdAT;
    private Date updateAT;


}
