package co.gov.mintic.costos.model;


import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private long id;
    private String email;
    private Profile profile;
    private RoleName roleName;
    private Enterprise enterprice;
    private List<Transaction> transactions;
    private Date createdAT;
    private Date updateAT;


}