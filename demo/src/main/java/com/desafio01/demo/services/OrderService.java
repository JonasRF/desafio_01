package com.desafio01.demo.services;

import com.desafio01.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double total(Order order){
        double discount = order.getBasic() * order.getDiscount() / 100;
        return order.getBasic() - discount;
    }
}
