package com.example.remotekitchen.remotekitchen.models.Roles;

import com.example.remotekitchen.remotekitchen.models.EntityWithUUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
public class Role extends EntityWithUUID {
    @Column(name = "NAME")
    public String Name;
}
