package com.pallavikri.QuizApp.DAO;

import com.pallavikri.QuizApp.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
