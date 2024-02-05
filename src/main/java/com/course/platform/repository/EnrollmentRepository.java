package com.course.platform.repository;

import com.course.platform.entities.Enrollment;
import com.course.platform.entities.pk.EnrollmentPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment , EnrollmentPk> {
}
