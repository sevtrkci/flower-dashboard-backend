package com.flower.flowerdashboardbackend.controller;

import com.flower.flowerdashboardbackend.input.FlowerInput;
import com.flower.flowerdashboardbackend.model.Flower;
import com.flower.flowerdashboardbackend.repository.FlowerRepository;
import com.flower.flowerdashboardbackend.service.FlowerService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/flower")
@RequiredArgsConstructor
public class FlowerController {

    private final FlowerService flowerService;

    @PostMapping("/add")
    private Flower addFlower(@Validated @RequestBody FlowerInput flowerInput){
        return flowerService.add(flowerInput);
    }

    @DeleteMapping("/delete/{id}")
    private void deleteFlower(@NotNull @PathVariable Long id){

        flowerService.delete(id);
    }

    @GetMapping
    private List<Flower> getFlowerList(){
        return flowerService.getFlowerlist();
    }

    @PutMapping("/update/{id}")
    private Flower updateFlower(@PathVariable("id") Long id,  @RequestBody FlowerInput flowerInput) {

        return flowerService.update(id, flowerInput);
    }

}
