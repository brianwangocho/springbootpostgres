package com.example.remotekitchen.remotekitchen.models;


import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class EntityWithUUID {
    @Id
    @Type(type = "pg-uuid")
    @Column(name="id")
    private UUID id;

    public EntityWithUUID() {
        this.id = UUID.randomUUID();;
    }
}
