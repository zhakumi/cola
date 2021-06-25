package com.wangcan.infr.customer;

import com.wangcan.domain.customer.User;
import com.wangcan.domain.customer.gateway.UserGateway;
import org.springframework.stereotype.Service;

@Service
public class UserGatewayImpl implements UserGateway {

    @Override
    public User getById(Long id) {
        return null;
    }
}
