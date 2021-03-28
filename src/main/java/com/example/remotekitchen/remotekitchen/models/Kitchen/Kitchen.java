package com.example.remotekitchen.remotekitchen.models.Kitchen;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.n52.jackson.datatype.jts.GeometryDeserializer;
import org.n52.jackson.datatype.jts.GeometrySerializer;
import org.locationtech.jts.geom.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "kitchens")
public class Kitchen implements Serializable {

    @Id
    @Type(type = "pg-uuid")
    @Column(name="id")
    private UUID id;

    @Column(name = "name")
    private String name;


    @Column(name = "status")
    private String Status;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "geom")
    @JsonSerialize(using = GeometrySerializer.class)
    @JsonDeserialize(contentUsing = GeometryDeserializer.class)
    private Point geom;

    @Column(name = "picture_url")
    public String pictureUrl;

    @Column(name="created_by")
    private UUID CreatedBy;

    @Column(name = "created_on",columnDefinition = "DATE")
    public Date createdOn;

    public Kitchen() {
        this.id = UUID.randomUUID();
    }
}
