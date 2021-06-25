package com.wangcan.client.test;

import com.alibaba.cola.dto.Response;
import com.wangcan.client.api.IUserService;
import com.wangcan.client.dto.UserSaveCmd;
import com.wangcan.client.dto.data.UserDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * This is for integration test.
 *
 * Created by fulan.zjf on 2017/11/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    private IUserService customerService;


    @Before
    public void setUp() {

    }

    @Test
    public void testCustomerAddSuccess(){
        //1.prepare
        UserSaveCmd userSaveCmd = new UserSaveCmd();
        UserDTO userDTO = new UserDTO();
        userDTO.setName("NormalName");
        userSaveCmd.setUserDTO(userDTO);
        //2.execute
        Response response = customerService.save(userSaveCmd);
        //3.assert
        Assert.assertTrue(response.isSuccess());
    }

}
