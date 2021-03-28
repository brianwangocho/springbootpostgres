package com.example.remotekitchen.remotekitchen.repository.KitchenRepository;

import com.example.remotekitchen.remotekitchen.models.Kitchen.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface KitchenRepository extends JpaRepository<Kitchen, UUID> {



//    @Query(value = "SELECT nhf.id, nhf.name, nhf.geom "
//            + "FROM nairobi_Health_facilities nhf, nairobi_sub_counties nsc "
//            + "WHERE ST_Within(nhf.geom, nsc.geom) AND nsc.id= :subCountyId"
//            , nativeQuery = true)
//    List<NairobiHealthFacility> findAllHospitalsWithinSubCounty(@Param("subCountyId")  int subCountyId);

@Query(value = "SELECT a.id,a.name," +
        " public.st_distance(cast(a.geom as point),ST_SetSRID(ST_Point(:userLongitude,:userLatitude),4326)) AS distance" +
        " from kitchens a  ORDER BY a.geom  <-> ST_SetSRID(ST_Point(:userLongitude,:userLatitude),4326)" +
        " LIMIT 5",nativeQuery = true)
    List<Kitchen>findNearbyKitchensByDistanceFromUser(@Param("userLongitude") Double userLongitude,@Param("userLatitude")  Double userLatitude);
}
