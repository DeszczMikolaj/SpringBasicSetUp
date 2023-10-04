package dev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spells")
public class Spell {

    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private Byte lvl;
    @Column
    private String element;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
