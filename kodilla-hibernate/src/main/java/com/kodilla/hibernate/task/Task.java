package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TASK")

public class Task {
    private int id;
    private String descryption;
    private Date created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    private TaskList taskList;
    private List<Task> task = new ArrayList<>();

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

    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    public List<Task> getTask() {
        return task;
    }

    public TaskList getTaskList() {
        return taskList;
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

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASK_FINANCIALS_ID")
    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }
    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    @OneToMany(
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public void setTask(List<Task> task) {
        this.task = task;
    }
}
