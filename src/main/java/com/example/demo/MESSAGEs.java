package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class MESSAGEs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private string MESSAGEs;

    @NotNull
    @Size(min = 10)
    private long id;

    @NotNull
    @Size(min = 4)
    private String content;

    @NotNull
    @Size(min = 10)
    private Date posteddate;

    @NotNull
    @Size(min = 10)
    private String sentby;

    public string getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(string MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPosteddate() {
        return posteddate;
    }

    public void setPosteddate(Date posteddate) {
        this.posteddate = posteddate;
    }

    public String getSentby() {
        return sentby;
    }

    public void setSentby(String sentby) {
        this.sentby = sentby;
    }
}