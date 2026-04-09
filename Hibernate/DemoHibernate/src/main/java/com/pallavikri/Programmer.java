package com.pallavikri;

import jakarta.persistence.*;

import java.util.List;

@Entity // To change Entity name: @Entity (name = "programmer_table")
// TO change table name: [@Table (name = "programmer_table")]
public class Programmer {

    @Id
    private int id;

//    @Column(name = "programmers_name")
    private String name;

//    @Transient (by using this "age" will not be store in DataBase)
    private String tech;

//    @OneToOne
//    private Laptop laptop;

    @OneToMany
    private List<Laptop> laptops;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
