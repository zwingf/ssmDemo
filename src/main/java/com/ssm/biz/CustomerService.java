package com.ssm.biz;

import com.ssm.dal.pojo.Customer;
import com.ssm.dal.pojo.QueryVo;

import java.util.List;

/**
 * Created by wing on 2017/5/27.
 */
public interface CustomerService {
    List<Customer> getCustList(QueryVo queryVo);
    int getCustListCount(QueryVo queryVo);
    Customer getCustomerById(long custId);
    void updateCustomerById(Customer customer);
}
