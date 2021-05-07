package com.example.jpaHibernate.repository;

import com.example.jpaHibernate.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> { }
