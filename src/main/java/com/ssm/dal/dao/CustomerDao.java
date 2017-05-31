package com.ssm.dal.dao;


import com.ssm.dal.pojo.Customer;
import com.ssm.dal.pojo.QueryVo;

import java.util.List;
public interface CustomerDao {

	List<Customer> getCustList(QueryVo queryVo);
	int getCustListCount(QueryVo queryVo);
	Customer getCustomerById(long custId);
	void updateCustomerById(Customer customer);
}
