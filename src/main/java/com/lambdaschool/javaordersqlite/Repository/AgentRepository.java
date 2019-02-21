package com.lambdaschool.javaordersqlite.Repository;

import com.lambdaschool.javaordersqlite.Models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AgentRepository extends JpaRepository<Agent, Long> {

    @Query(value="SELECT A.*, C.custname, C.custcode as custcode FROM agents A, customers C WHERE A.agentcode = C.agentcode ")
    List<Object[]> agentsWITHCustomers();
}
