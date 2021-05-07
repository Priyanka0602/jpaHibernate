package com.example.jpaHibernate.repository;

import com.example.jpaHibernate.dao.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRespository extends JpaRepository<Address,Long> { }