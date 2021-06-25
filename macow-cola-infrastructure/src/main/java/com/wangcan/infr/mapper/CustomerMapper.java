package com.wangcan.infr.mapper;

import com.wangcan.infr.customer.CustomerDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDO getById(String customerId);
}
