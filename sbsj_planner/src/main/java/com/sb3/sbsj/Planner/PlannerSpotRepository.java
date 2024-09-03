package com.sb3.sbsj.Planner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface PlannerSpotRepository extends JpaRepository<PlannerSpot, Long> {
    List<PlannerSpot> findAllByPlannerPlanIdAndNowDateBetweenOrderByPlanSpId(Long planId, Date start, Date end);
    List<PlannerSpot> findAllByPlannerPlanIdOrderByPlanSpId(Long planId);
    @Transactional
    void deleteAllByPlannerPlanId(Long planId);
    @Transactional
    void deleteByPlanSpId(Long planSpId);
}
