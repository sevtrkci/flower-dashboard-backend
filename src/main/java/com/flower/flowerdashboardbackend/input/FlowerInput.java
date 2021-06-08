package com.flower.flowerdashboardbackend.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class FlowerInput implements Serializable {

    @NotNull(message = "Name can not be null")
    private String name;

    private String description;

    private String imageSource;

    private BigDecimal price;

    private BigDecimal oldPrice;
}
