package com.onetoone.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.onetoone.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
