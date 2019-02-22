package com.lambdaschool.javaordersqlite.Repository;

import com.lambdaschool.javaordersqlite.Models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AgentRepository extends JpaRepository<Agent, Long> {

}
