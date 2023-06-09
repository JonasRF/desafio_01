package com.desafio01.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.desafio01.demo.entities.Order;
import com.desafio01.demo.services.OrderService;
import com.desafio01.demo.services.ShippingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.lang.model.element.RecordComponentElement;
import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Code: ");
		Integer code = Integer.valueOf(sc.next());
		System.out.print("Basic: ");
		Double basic = sc.nextDouble();
		System.out.print("Discount: ");
        Double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		OrderService orderService = new OrderService();
		ShippingService shippingService = new ShippingService(orderService);

		double v = shippingService.shipment(order);

		System.out.printf(String.format("%.2f%n", v));
	}


}
