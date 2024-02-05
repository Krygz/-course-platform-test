package com.course.platform.repository;

import com.course.platform.entities.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content , Long> {
}
