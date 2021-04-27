package com.example.remotekitchen.remotekitchen.models.FoodItem;

import com.example.remotekitchen.remotekitchen.models.MenuItem.MenuItem;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "food_item")
public class FoodItem {
    @Id
    @Type(type = "pg-uuid")
    @Column(name="id")
    public UUID id;


    @Column(name="menu_id")
    public UUID menuId;

    @ManyToOne
    @JoinColumn(name="menu_id")
    private MenuItem menuItem;

    @Column(name = "name")
    public String name;


    @Column(name="description")
    public String description;

    @Column(name="picture_url")
    public String pictureUrl;

    @Column(name = "created_on")
    public Date createdOn;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getMenuId() {
        return menuId;
    }

    public void setMenuId(UUID menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn() {
        this.createdOn = new Date();
    }
}
