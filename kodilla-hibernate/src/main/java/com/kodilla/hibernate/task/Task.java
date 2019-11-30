package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "TASK")

public class Task {
    private int id;
    private String descryption;
    private Date created;
    private int duration;

    public Task(String descryption, int duration){
        this.descryption = descryption;
        this.created = new Date();
        this.duration = duration;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId(){
        return id;
    }
    @Column(name = "DESCRYPTION")
    public String getDescryption(){
        return descryption;
    }
    @NotNull
    @Column(name = "CREATED")
    public Date getCreated(){
        return created;
    }
    @Column(name = "DURATION")
    public int getDuration(){
        return duration;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescryption(String descryption) {
        this.descryption = descryption;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }

}
