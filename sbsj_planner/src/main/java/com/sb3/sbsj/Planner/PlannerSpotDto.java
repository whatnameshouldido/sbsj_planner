package com.sb3.sbsj.Planner;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlannerSpotDto {
    private Long planSpId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date nowDate;
    private String whatDay;
    private int time;
    private String spotMemo;
    private float howFar;

    private List<PlannerSpotDto> plannerList;
}
