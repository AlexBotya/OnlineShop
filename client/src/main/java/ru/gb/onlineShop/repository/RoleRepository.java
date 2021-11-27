package ru.gb.onlineShop.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.gb.onlineShop.entity.Role;
@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {
}
