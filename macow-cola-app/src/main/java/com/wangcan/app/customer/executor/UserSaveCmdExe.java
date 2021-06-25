
package com.wangcan.app.customer.executor;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.exception.BizException;
import com.wangcan.client.dto.UserSaveCmd;
import com.wangcan.client.dto.data.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


/**
 * 相当于services 层
 */
@Component
@Slf4j
public class UserSaveCmdExe {

    public Response execute(UserSaveCmd cmd) {
        log.info(cmd.getUserDTO().getId() + "save");
        // TODO 访问领域层
        return Response.buildSuccess();
    }

}
