package com.example.springbootproject.repository;

import com.example.springbootproject.model.Commande;
import com.example.springbootproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
    Commande findByProduct(Product product);
}

