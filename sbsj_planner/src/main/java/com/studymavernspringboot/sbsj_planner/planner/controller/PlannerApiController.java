package com.studymavernspringboot.sbsj_planner.planner.controller;


import com.studymavernspringboot.sbsj_planner.planner.Dto.PlannerSpotDto;
import com.studymavernspringboot.sbsj_planner.planner.Service.impl.PlannerSpotServiceImpl;
import com.studymavernspringboot.sbsj_planner.planner.Service.impl.PlannerServiceImpl;
import com.studymavernspringboot.sbsj_planner.planner.domain.PlannerSpot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PlannerApiController {
    @Autowired
    private PlannerServiceImpl plannerService;

    @Autowired
    private PlannerSpotServiceImpl planService;

    @PostMapping("/users/{userid}/planners")
    public ResponseEntity<String> plannerInsert(@RequestBody PlannerSpotDto param, @PathVariable("userid") String userId) {
        PlannerSpot planner = plannerService.insertPlanner(param.getPlanner());
    }

}
