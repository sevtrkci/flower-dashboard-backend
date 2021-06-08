package com.flower.flowerdashboardbackend.service;

import com.flower.flowerdashboardbackend.input.FlowerInput;
import com.flower.flowerdashboardbackend.model.Flower;

import java.util.List;

public interface FlowerService {

    Flower add(FlowerInput flowerInput);

    void delete(Long id);

    List<Flower> getFlowerlist();

    Flower update(Long id, FlowerInput flowerInput);
}
