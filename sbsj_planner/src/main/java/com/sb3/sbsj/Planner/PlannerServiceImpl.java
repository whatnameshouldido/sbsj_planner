package com.sb3.sbsj.Planner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class PlannerServiceImpl implements PlannerService {
    @Autowired
    private PlannerRepository repository;

    public Planner insertPlanner(Planner planner) {
        Planner savedPlanner = repository.save(planner);
        return savedPlanner;
    }

    @Override
    public PlannerDto insertPlanner(PlannerDto dto) throws ParseException {
        Planner entity = dtoEntity(dto);
    }
}
