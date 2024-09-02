package com.studymavernspringboot.sbsj_planner.planner.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="planner_tbl")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@SequenceGenerator(name = "PLANNER_SEQ_GEN", sequenceName = "PLANNER_SEQ", initialValue = 1, allocationSize = 1)
public class Plannner {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PLANNER_SEQ_GEN")
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "startDate", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date startDate;

    @Column(name = "endDate", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date endDate;

    @Column(name = "memo", nullable = true, length = 100)
    private String memo;

    @Column(name = "people", nullable = false)
    private int people;
}
