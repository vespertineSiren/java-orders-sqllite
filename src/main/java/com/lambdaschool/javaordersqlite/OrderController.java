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


}