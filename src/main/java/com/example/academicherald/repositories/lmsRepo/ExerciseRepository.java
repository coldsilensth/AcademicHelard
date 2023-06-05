package com.example.academicherald.repositories.lmsRepo;

import com.example.academicherald.entity.lms.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}