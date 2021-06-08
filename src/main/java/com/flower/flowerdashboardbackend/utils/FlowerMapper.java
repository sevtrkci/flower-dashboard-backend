package com.flower.flowerdashboardbackend.utils;

import com.flower.flowerdashboardbackend.input.FlowerInput;
import com.flower.flowerdashboardbackend.model.Flower;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FlowerMapper {

    FlowerMapper INSTANCE = Mappers.getMapper(FlowerMapper.class);

    Flower convertFlower(FlowerInput flowerInput);

}
