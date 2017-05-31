package com.ssm.dal.dao;

import com.ssm.dal.pojo.BaseDict;

import java.util.List;


public interface BaseDictDao {

	List<BaseDict> getBaseDictList(String typeCode);
}
