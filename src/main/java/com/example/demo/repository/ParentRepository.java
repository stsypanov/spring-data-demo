package com.example.demo.repository;

import com.example.demo.entity.ChildEntity;
import com.example.demo.entity.ParentEntity;
import com.example.demo.repository.base.BaseJpaRepository;

public interface ParentRepository extends BaseJpaRepository<ParentEntity, Long> {
}
