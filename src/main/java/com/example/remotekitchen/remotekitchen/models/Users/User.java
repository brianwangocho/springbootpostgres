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
    public String FirstName;
    @Column(name = "last_name")
    public String LastName;
    @Column(name = "email")
    public  String Email;
    @Column(name = "email_verified")
    public Boolean EmailVerified;
    @Column(name = "status")
    public String Status;
    @Column(name = "account_locked")
    public  Boolean AccountLocked;
    @Column(name = "password")
    public String Password;
    @Column(name = "telephone")
    public String Telephone;
    @Column(name = "picture_url")
    public String PictureUrl;
    @Column(name = "created_on",columnDefinition = "DATE")
    public Date CreatedOn;

}
