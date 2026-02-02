package com.Projeto.InicioComSpring.Services;

import com.Projeto.InicioComSpring.Entities.Order;
import com.Projeto.InicioComSpring.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order FindById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
