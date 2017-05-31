package com.ssm.web;

import com.ssm.biz.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wing on 2017/5/27.
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/edit")
    public void selectCustomer(){
        customerService.getCustomerById(14);
    }
}
