package com.Projeto.InicioComSpring.Repositories;
import com.Projeto.InicioComSpring.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
