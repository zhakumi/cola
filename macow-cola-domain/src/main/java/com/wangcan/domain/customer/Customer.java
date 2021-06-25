package com.wangcan.domain.customer;

import com.alibaba.cola.domain.Entity;
import com.alibaba.cola.exception.BizException;
import lombok.Data;

@Data
@Entity
public class Customer{

    private String customerId;
    private String memberId;
    private String globalId;
    private Long registeredCapital;
    private String companyName;

}
