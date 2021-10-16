package com.rapipay.springboot.repository;
import java.lang.Long;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.rapipay.springboot.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
