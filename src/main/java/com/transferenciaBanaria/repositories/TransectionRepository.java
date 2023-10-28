package com.transferenciaBanaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transferenciaBanaria.domain.transection.Transection;

public interface TransectionRepository extends JpaRepository<Transection, Long> {

}
