package com.pallavikri.Ecomm_SpringProject.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {

}
