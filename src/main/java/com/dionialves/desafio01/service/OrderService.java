package com.dionialves.desafio01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dionialves.desafio01.entities.Order;


@Service
public class OrderService {

  @Autowired
  private ShippingService shippingService;

  public Double total(Order order) {
    return shippingService.shipment(order);
  }   
}
