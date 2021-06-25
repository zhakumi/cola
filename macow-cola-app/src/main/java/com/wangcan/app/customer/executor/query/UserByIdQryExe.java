package com.wangcan.app.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.wangcan.client.dto.UserByIdQry;
import com.wangcan.client.dto.data.UserDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
public class UserByIdQryExe {

    public MultiResponse<UserDTO> execute(UserByIdQry cmd) {
        List<UserDTO> userDTOList = new ArrayList<>();
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        userDTO.setName("wa");
        userDTO.setAge(22);
        userDTOList.add(userDTO);
        // todo 访问基础设施层
        return MultiResponse.of(userDTOList);
    }
}
