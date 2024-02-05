package com.course.platform.repository;

import com.course.platform.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer , Long> {
}
