package com.Projeto.InicioComSpring.Repositories;
import com.Projeto.InicioComSpring.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
