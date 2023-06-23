package com.onetoone.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.onetoone.entity.Brand;
public interface BrandRepository extends JpaRepository<Brand, Long> {

}
