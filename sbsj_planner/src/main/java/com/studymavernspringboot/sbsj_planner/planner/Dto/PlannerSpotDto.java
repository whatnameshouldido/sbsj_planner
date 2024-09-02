package com.studymavernspringboot.sbsj_planner.planner.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlannerSpotDto {
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date nowDate;
    private String whatDay;
    private int time;
    private String spotMemo;
    private float howFar;
}
