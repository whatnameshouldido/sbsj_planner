package com.sb3.sbsj.Planner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PlannerRepository extends JpaRepository<Planner, Long> {
    List<Planner> findAllByNameOrderByPlanIdDesc(String name);
    Planner findByPlanId(Long planId);
    @Transactional
    void deleteByPlanId(Long planId);
}
