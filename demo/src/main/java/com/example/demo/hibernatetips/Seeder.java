package com.example.demo.hibernatetips;

import com.example.demo.hibernatetips.entity.Order;
import com.example.demo.hibernatetips.entity.OrderLine;
import com.example.demo.hibernatetips.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
@Component
@Transactional
public class Seeder implements CommandLineRunner
{
    private final EntityManager entityManager;

    @Override
    public void run(String... args)
    {
        Product product = new Product();
        entityManager.persist(product);

        Order order = new Order();

        OrderLine orderLine = new OrderLine();
        order.getOrderLines().add(orderLine);
        orderLine.setProductId(product.getId());

        entityManager.persist(order);
    }
}
