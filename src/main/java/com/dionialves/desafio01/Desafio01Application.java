package com.dionialves.desafio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dionialves.desafio01.entities.Order;
import com.dionialves.desafio01.service.OrderService;;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner{

  @Autowired
  private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    Order order = new Order(1058, 50.00, 7.78);

    System.out.println("-------------------------------------------");
    System.out.println("Codigo do Produto: " + order.getCode());
    System.out.println("Valor: " + order.getBasic());
    System.out.println("Desconto: " + order.getDiscount());
    System.out.println("-------------------------------------------");
    System.out.println("Total: " + orderService.total(order));
  
  }

}
