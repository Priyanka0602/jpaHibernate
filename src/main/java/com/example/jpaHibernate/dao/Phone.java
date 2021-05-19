package com.example.jpaHibernate.dao;

import javax.persistence.Embeddable;

@Embeddable
public class Phone {
    private long myNumber;

    public Phone() {
    }

    public Phone(long myNumber) {
        this.myNumber = myNumber;
    }

    public long getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(long myNumber) {
        this.myNumber = myNumber;
    }
}
