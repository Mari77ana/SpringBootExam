package com.examapp.Springserver.model.users;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

// Create Table with PrimaryKey -> unique user by automatically
// generating id to each user in Db
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastname;
    private String location;
    private LocalDate birthDate;

    @JsonFormat(pattern = "HH:mm:ss") // added converter for response in Postman
    private LocalTime birthTime; // changed from Time -> LocalTime

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /*
    public Time getBirthTime() {
        return birthTime;
    }
    Hade this at first with Time
     */

    public void setBirthTime(LocalTime localTime) {
        this.birthTime = localTime;

    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                ", birthTime=" + birthTime +
                '}';
    }
}
