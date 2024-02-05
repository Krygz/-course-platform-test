package com.course.platform.repository;

import com.course.platform.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource , Long> {
}
