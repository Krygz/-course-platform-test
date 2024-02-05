package com.course.platform.repository;

import com.course.platform.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply , Long> {
}
