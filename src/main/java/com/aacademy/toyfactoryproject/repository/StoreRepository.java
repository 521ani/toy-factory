package com.aacademy.toyfactoryproject.repository;

import com.aacademy.toyfactoryproject.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
}