package com.rest.simplecrm.interactions;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="interaction")
public class Interaction {
    
    
    // Many interactions can be associated with one customer
    // @ManyToOne(optional = false)
    // @JoinColumn(name = "customer_id", referencedColumnName = "id")
    // private Customer customer;

    // public Customer getCustomer() {
    //     return this.customer;
    // }

    // public void setCustomer(Customer customer) {
    //     this.customer = customer;
    // }
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "remark")
    private String remark;
    @Column(name = "interaction_date")
    private int interactionDate;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getInteractionDate() {
        return this.interactionDate;
    }

    public void setInteractionDate(int interactionDate) {
        this.interactionDate = interactionDate;
    }


}
