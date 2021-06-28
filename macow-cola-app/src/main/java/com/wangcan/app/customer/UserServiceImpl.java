package com.wangcan.app.customer;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wangcan.app.customer.executor.UserSaveCmdExe;
import com.wangcan.app.customer.executor.query.UserByIdQryExe;
import com.wangcan.client.api.IUserService;
import com.wangcan.client.dto.UserSaveCmd;
import com.wangcan.client.dto.UserByIdQry;
import com.wangcan.client.dto.data.UserDTO;
import com.wangcan.domain.customer.User;
import com.wangcan.domain.customer.gateway.UserGateway;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
@CatchAndLog
public class UserServiceImpl implements IUserService {

    @Resource
    private UserSaveCmdExe userSaveCmdExe;

    @Resource
    private UserByIdQryExe userByIdQryExe;


    @Override
    public Response save(UserSaveCmd userSaveCmd) {
        return userSaveCmdExe.execute(userSaveCmd);
    }

    @Override
    public MultiResponse<UserDTO> getById(UserByIdQry userByIdQry) {

        return userByIdQryExe.execute(userByIdQry);
    }

}