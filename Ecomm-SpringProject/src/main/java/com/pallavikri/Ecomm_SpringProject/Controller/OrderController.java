package com.pallavikri.Ecomm_SpringProject.Controller;

import com.pallavikri.Ecomm_SpringProject.model.dto.OrderRequest;
import com.pallavikri.Ecomm_SpringProject.model.dto.OrderResponse;
import com.pallavikri.Ecomm_SpringProject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public ResponseEntity<OrderResponse> placeOrder (@RequestBody OrderRequest orderRequest){
        OrderResponse orderResponse = orderService.placeOrder(orderRequest);
        return new ResponseEntity<>(orderResponse, HttpStatus.CREATED);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderResponse>>  getAllOrders(){
        List<OrderResponse> responses = orderService.getAllOrdersResponses();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }
}
