package com.course.platform.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_deliver")
public class Deliver implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uri;
    private Instant moment;
    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    public Deliver() {
    }

}
