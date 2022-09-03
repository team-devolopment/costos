package co.gov.mintic.costos.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Transaction {

    private long id;
    private String concept;
    private float amount;
    private Employee employee;
    private Enterprise enterprise;
    private Date createdAT;
    private Date updateAT;


}
