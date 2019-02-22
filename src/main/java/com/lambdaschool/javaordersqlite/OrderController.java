package com.lambdaschool.javaordersqlite;

import com.lambdaschool.javaordersqlite.Models.Agent;
import com.lambdaschool.javaordersqlite.Models.Customer;
import com.lambdaschool.javaordersqlite.Models.Order;
import com.lambdaschool.javaordersqlite.Repository.AgentRepository;
import com.lambdaschool.javaordersqlite.Repository.CustomerRepository;
import com.lambdaschool.javaordersqlite.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    AgentRepository agentRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    //GetMapping - ALL

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("/orders")
    public List<Order> getALLOrders(){
        return orderRepository.findAll();
    }

    @GetMapping("/agents")
    public List<Agent> getALLAgents(){
        return agentRepository.findAll();
    }

    //GetMapping - Based on custcode/ordnum/agentcode

    @GetMapping("/customers/custcode/{custcode}")
    public Customer getCustomerBasedOnCustCode(@PathVariable long custcode) {
        return customerRepository.findById(custcode).orElseThrow();
    }

    @GetMapping("/orders/ordnum/{ordnum}")
    public Order getOrderBasedOnOrdnum(@PathVariable long ordnum) {
        return orderRepository.findById(ordnum).orElseThrow();
    }

    @GetMapping("/agents/agentcode/{agentcode}")
    public Agent getAgentBasedOnAgentcode(@PathVariable long agentcode) {
        return agentRepository.findById(agentcode).orElseThrow();
    }


}