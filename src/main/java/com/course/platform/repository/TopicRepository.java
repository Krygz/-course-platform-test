package com.course.platform.repository;

import com.course.platform.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic , Long> {
}
