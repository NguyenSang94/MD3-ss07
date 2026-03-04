package com.example.session07.repository;

import com.example.session07.model.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICandidateRepository extends JpaRepository<Candidate, Long> {
}
