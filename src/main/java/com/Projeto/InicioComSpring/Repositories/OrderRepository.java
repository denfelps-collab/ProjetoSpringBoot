package com.Projeto.InicioComSpring.Repositories;
import com.Projeto.InicioComSpring.Entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
