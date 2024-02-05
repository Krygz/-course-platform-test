package com.course.platform.repository;

import com.course.platform.entities.Lesson;
import com.course.platform.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {
}
