package com.Projeto.InicioComSpring.Repositories;

import com.Projeto.InicioComSpring.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
