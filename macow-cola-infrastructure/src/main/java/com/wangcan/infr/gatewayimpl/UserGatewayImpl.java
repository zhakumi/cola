package com.wangcan.infr.gatewayimpl;

import com.wangcan.domain.customer.User;
import com.wangcan.domain.customer.gateway.UserGateway;
import com.wangcan.infr.mapper.UserMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 实现领域层的 UserGateway
 */
@Service
public class UserGatewayImpl implements UserGateway {

    @Resource
    private UserMapper userMapper;
    @Override
    public User getById(Long id) {
        return userMapper.getById(id);
    }
}
