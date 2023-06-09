package com.desafio01.demo.services;

import com.desafio01.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private OrderService orderService;

    public ShippingService(OrderService orderService) {
        this.orderService = orderService;
    }

    public double shipment(Order order){

        if(order.getBasic() < 100){
            return orderService.total(order) + 20.00;
        } else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
            return orderService.total(order) + 12.00;
        }else{
            return orderService.total(order);
        }

    }
}
