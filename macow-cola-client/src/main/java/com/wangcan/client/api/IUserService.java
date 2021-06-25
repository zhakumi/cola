package com.wangcan.client.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wangcan.client.dto.UserSaveCmd;
import com.wangcan.client.dto.UserByIdQry;
import com.wangcan.client.dto.data.UserDTO;

public interface IUserService {

    /**
     * 保存
     * @param userSaveCmd
     * @return
     */
     Response save(UserSaveCmd userSaveCmd);

    /**
     * 通过ID 查询
     * @param userByIdQry
     * @return
     */
     MultiResponse<UserDTO> getById(UserByIdQry userByIdQry);
}
