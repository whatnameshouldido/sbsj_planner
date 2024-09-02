package com.studymavernspringboot.sbsj_planner.planner.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "planner_spot_tbl")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@SequenceGenerator(name = "PLAN_SPT_SEQ_GEN", sequenceName = "PLAN_SPT_SEQ", initialValue = 1, allocationSize = 1)
public class PlannerSpot {

    @Id
    @Column(name= "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "PLAN_SPT_SEQ_GEN")
    private Long id;

    @Column(name = "nowDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date nowDate;

    @PrePersist
    protected void prePersist(){
        nowDate = new Date();
    }

    @PreUpdate
    protected void preUpdate(){
        nowDate = new Date();
    }

    @Column(name = "whatDay", nullable = false, length = 2)
    private String whatDay;

    @Column(name = "time", nullable = false)
    private int time;

    @Column(name = "spotMemo", nullable = true, length = 100)
    private String spotMemo;

    @Column(name = "howFar", nullable = false)
    private float howFar;
}
