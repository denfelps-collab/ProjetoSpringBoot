package com.Projeto.InicioComSpring.Repositories;
import com.Projeto.InicioComSpring.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
