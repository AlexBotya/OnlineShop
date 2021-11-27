
package ru.gb.onlineShop.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import ru.gb.onlineShop.entity.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}

