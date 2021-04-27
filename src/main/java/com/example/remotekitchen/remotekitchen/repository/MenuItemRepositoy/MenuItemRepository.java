package com.example.remotekitchen.remotekitchen.repository.MenuItemRepositoy;


import com.example.remotekitchen.remotekitchen.models.MenuItem.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.UUID;

@Repository
public interface MenuItemRepository  extends JpaRepository<MenuItem, UUID> {
}
