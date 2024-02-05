package com.course.platform.repository;

import com.course.platform.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section , Long> {
}
