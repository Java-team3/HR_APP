package by.team34.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class SuitableStatePK implements Serializable {
    @Basic
    private String name;

    public SuitableStatePK(String name) {
        this.name = name;
    }

}
