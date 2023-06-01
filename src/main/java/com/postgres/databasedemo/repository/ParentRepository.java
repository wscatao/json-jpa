package com.postgres.databasedemo.repository;

import com.postgres.databasedemo.constant.ChildEnum;
import com.postgres.databasedemo.repository.entity.Child;
import com.postgres.databasedemo.repository.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParentRepository extends JpaRepository<Parent, UUID> {

    Parent findByName(String name);
}
