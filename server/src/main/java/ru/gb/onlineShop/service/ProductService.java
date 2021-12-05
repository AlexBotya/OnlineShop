package ru.gb.onlineShop.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.gb.onlineShop.entity.Product;
import ru.gb.onlineShop.repository.ProductRepository;

import java.util.Collection;
import java.util.stream.StreamSupport;

@Service
@Data
public class ProductService {
    private final ProductRepository productRepository;

    public Collection<Product> findAll(){
        return StreamSupport.stream(productRepository.findAll().spliterator(), true).toList();
    }
}
