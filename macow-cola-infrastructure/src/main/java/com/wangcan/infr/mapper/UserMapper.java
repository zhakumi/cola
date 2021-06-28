package com.wangcan.infr.mapper;

import com.wangcan.domain.customer.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getById(Long id);
}
