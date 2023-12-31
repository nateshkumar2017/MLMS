package com.mlms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestResult {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    //hatao
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patientId;



    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;

    @OneToOne
    @JoinColumn(name = "report_id")
    private Report report;

    private float result;

    @ManyToOne
    @JoinColumn(name = "test_attribute_id")
    private TestAttribute testAttribute;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;





}
