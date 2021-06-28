package com.wangcan.app.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.wangcan.client.dto.UserByIdQry;
import com.wangcan.client.dto.data.UserDTO;
import com.wangcan.domain.customer.User;
import com.wangcan.domain.customer.gateway.UserGateway;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;


@Component
public class UserByIdQryExe {

    @Resource
    private UserGateway userGateway;

    public MultiResponse<UserDTO> execute(UserByIdQry cmd) {
        // 直接访问领域层
        User user = userGateway.getById(1L);
        if (user == null) {
            MultiResponse.of(null);
        }
        List<UserDTO> userDTOList = new ArrayList<>();
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTOList.add(userDTO);
        return MultiResponse.of(userDTOList);
    }
}
