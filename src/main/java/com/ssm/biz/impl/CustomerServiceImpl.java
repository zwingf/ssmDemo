package com.ssm.biz.impl;

import com.ssm.biz.CustomerService;
import com.ssm.dal.dao.CustomerDao;
import com.ssm.dal.pojo.Customer;
import com.ssm.dal.pojo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wing on 2017/5/27.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public List<Customer> getCustList(QueryVo queryVo) {
        return null;
    }

    public int getCustListCount(QueryVo queryVo) {
        return 0;
    }

    public Customer getCustomerById(long custId) {
        return customerDao.getCustomerById(custId);
    }

    public void updateCustomerById(Customer customer) {

    }
}
