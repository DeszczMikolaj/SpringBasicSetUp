package dev.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "characters")
public class Character {

    @Column
    private Byte lvl;
    @OneToMany
    private List<Spell> knownSpells;
    @Column
    private String name;
    @Id
    private Integer id;

    public Character() {
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "lvl=" + lvl +
                ", knownSpells=" + knownSpells +
                ", name='" + name + '\'' +
                '}';
    }

    public Character(Byte lvl, List<Spell> knownSpells, String name) {
        this.lvl = lvl;
        this.knownSpells = knownSpells;
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(Byte lvl) {
        this.lvl = lvl;
    }

    public List<Spell> getKnownSpells() {
        return knownSpells;
    }

    public void setKnownSpells(List<Spell> knownSpells) {
        this.knownSpells = knownSpells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
