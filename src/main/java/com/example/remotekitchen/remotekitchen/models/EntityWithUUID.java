package com.example.remotekitchen.remotekitchen.models;


import lombok.Data;
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
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
