package com.mlms.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.data.jpa.repository.Temporal;

//import javax.persistence.Entity;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import java.util.Date;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;


    //private User userId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderCreatedDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date actionTakenDateTime;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @JsonIgnore
    @JsonBackReference
    private Patient patient;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private ReportStatus reportStatus;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;




//    public Order(User user) {
//        this.user = user;
//    }


}
