package com.studymavernspringboot.sbsj_planner.planner.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="planner_tbl")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@SequenceGenerator(name = "PLAN_SEQ_GENERATOR", sequenceName = "PLAN_SEQ", initialValue = 1, allocationSize = 1)
public class Plan {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PLAN_SEQ_GENERATOR")
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "startDate", nullable = false)
    private String startDate;

    @Column(name = "endDate", nullable = false)
    private String endDate;

    @Column(name = "memo", length = 100)
    private String memo;

    @Column(name = "people", nullable = false)
    private String people;
}
