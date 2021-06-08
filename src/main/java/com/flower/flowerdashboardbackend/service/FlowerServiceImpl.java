package com.flower.flowerdashboardbackend.service;

import com.flower.flowerdashboardbackend.input.FlowerInput;
import com.flower.flowerdashboardbackend.model.Flower;
import com.flower.flowerdashboardbackend.repository.FlowerRepository;
import com.flower.flowerdashboardbackend.utils.FlowerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
class FlowerServiceImpl implements FlowerService {

    private final FlowerRepository flowerRepository;

    @Override
    public Flower add(FlowerInput flowerInput) {

        final Flower flower = FlowerMapper.INSTANCE.convertFlower(flowerInput);
        return flowerRepository.save(flower);
    }

    @Override
    public void delete(Long id) {

        flowerRepository.deleteById(id);
    }

    @Override
    public List<Flower> getFlowerlist() {

        return flowerRepository.findAll();
    }

    @Override
    public Flower update(Long id, FlowerInput flowerInput) {

        final Flower flower = FlowerMapper.INSTANCE.convertFlower(flowerInput);

        Flower willUpdated = flowerRepository.findById(id).get();


        willUpdated.setPrice(flower.getPrice());
        willUpdated.setOldPrice(flower.getOldPrice());
        willUpdated.setImageSource(flower.getImageSource());
        willUpdated.setDescription(flower.getDescription());
        willUpdated.setName(flower.getName());

        return flowerRepository.save(willUpdated);
    }
}
