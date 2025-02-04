package com.dionialves.desafio01.service;

import org.springframework.stereotype.Service;
import com.dionialves.desafio01.entities.Order;

@Service
public class ShippingService {

  public Double shipment(Order order) {

    Double value = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));
    
    if (value >= 200) {
      return value;
    } else if(value >= 100) {
      return value + 12;
    } else {
      return value + 20;
    }
  }
}
