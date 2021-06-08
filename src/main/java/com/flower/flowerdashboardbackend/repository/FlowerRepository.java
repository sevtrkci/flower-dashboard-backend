package com.flower.flowerdashboardbackend.repository;

import com.flower.flowerdashboardbackend.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlowerRepository extends JpaRepository<Flower, Long> {

    Flower save(Flower flower);

    @Query("select t from Flower t")
    List<Flower> getFlowerlist();


}
