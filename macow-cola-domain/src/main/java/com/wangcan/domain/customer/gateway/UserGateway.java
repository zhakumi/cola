package com.wangcan.domain.customer.gateway;

import com.wangcan.domain.customer.User;

/**
 * @author Administrator
 */
public interface UserGateway {
    User getById(Long  id);
}
