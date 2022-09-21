package com.test.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.details.entities.Details;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Long>{
    Details findById (long id);
}
