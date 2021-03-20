package com.example.remotekitchen.remotekitchen.models.Users;

import com.example.remotekitchen.remotekitchen.models.EntityWithUUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User extends EntityWithUUID {

    @Column(name = "first_name")
    public String firstName;
    @Column(name = "last_name")
    public String lastName;
    @Column(name = "email")
    public  String email;
    @Column(name = "email_verified")
    public Boolean emailVerified;
    @Column(name = "status")
    public String status;
    @Column(name = "account_locked")
    public  Boolean accountLocked;
    @Column(name = "password")
    public String password;
    @Column(name = "telephone")
    public String telephone;
    @Column(name = "picture_url")
    public String pictureUrl;
    @Column(name = "created_on",columnDefinition = "DATE")
    public Date createdOn;

}
