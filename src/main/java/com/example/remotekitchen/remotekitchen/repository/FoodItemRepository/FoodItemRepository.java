package com.example.remotekitchen.remotekitchen.repository.FoodItemRepository;

import com.example.remotekitchen.remotekitchen.models.FoodItem.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, UUID> {
}
