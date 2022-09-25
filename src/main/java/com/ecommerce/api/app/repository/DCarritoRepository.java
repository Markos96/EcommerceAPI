package com.ecommerce.api.app.repository;

import com.ecommerce.api.app.model.DCarrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DCarritoRepository extends JpaRepository<DCarrito, Integer> {
}
