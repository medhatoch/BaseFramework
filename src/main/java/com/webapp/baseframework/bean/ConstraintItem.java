/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.baseframework.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author ESDAIRI
 */
@Entity
public class ConstraintItem implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Input input;
    @OneToMany(mappedBy = "constraintItem")
    private List<CriticalValue> criticalValues;
    @ManyToOne
    private Constrainte constrainte;
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public List<CriticalValue> getCriticalValues() {
        return criticalValues;
    }

    public void setCriticalValues(List<CriticalValue> criticalValues) {
        this.criticalValues = criticalValues;
    }

    public Constrainte getConstrainte() {
        return constrainte;
    }

    public void setConstrainte(Constrainte constrainte) {
        this.constrainte = constrainte;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConstraintItem)) {
            return false;
        }
        ConstraintItem other = (ConstraintItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webapp.baseframework.bean.ConstraintItem[ id=" + id + " ]";
    }
    
}
