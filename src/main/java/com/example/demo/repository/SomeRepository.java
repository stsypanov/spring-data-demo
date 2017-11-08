package com.example.demo.repository;

import com.example.demo.entity.ChildEntity;
import com.example.demo.entity.SomeEntity;
import com.example.demo.repository.base.BaseJpaRepository;

public interface SomeRepository extends BaseJpaRepository<SomeEntity, Long> {
}
