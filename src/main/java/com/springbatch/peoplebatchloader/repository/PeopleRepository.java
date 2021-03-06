package com.springbatch.peoplebatchloader.repository;

import com.springbatch.peoplebatchloader.entity.PeopleEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<PeopleEntity, Long> {

}
