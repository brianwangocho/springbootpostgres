package com.example.remotekitchen.remotekitchen.models.MenuItem;

import com.example.remotekitchen.remotekitchen.models.FoodItem.FoodItem;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Table(name = "kitchen_menu")
@Entity
public class MenuItem {

    @Id
    @Type(type = "pg-uuid")
    @Column(name="id")
    public UUID id;



    @Column(name="kitchen_id")
    public UUID KitchenId;


    @Column(name="name")
    public String Name;


    @OneToMany(mappedBy = "food_item")
    private List<FoodItem> foodItemList;

    public UUID getId() {
        return id;
    }

    public UUID getKitchenId() {
        return KitchenId;
    }

    public String getName() {
        return Name;
    }

    public List<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setKitchenId(UUID kitchenId) {
        KitchenId = kitchenId;
    }

    public void setName(String name) {
        Name = name;
    }
}
