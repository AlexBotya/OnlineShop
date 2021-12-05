package ru.gb.onlineShop.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.onlineShop.entity.Product;
import ru.gb.onlineShop.service.ProductService;
import java.util.Collection;


@RestController
@RequestMapping("/products")
@Data
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public Collection<Product> findAll() { return productService.findAll();}

}
