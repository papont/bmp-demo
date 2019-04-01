package com.company.bmpdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|number")
@Table(name = "DEMO_CONTRACT")
@Entity(name = "demo$Contract")
public class Contract extends StandardEntity {
    private static final long serialVersionUID = 8876776815177256863L;

    @Column(name = "NUMBER_")
    protected String number;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_")
    protected Date date;

    @Column(name = "STATE")
    protected String state;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


}