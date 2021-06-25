package com.wangcan.domain.customer;

import com.alibaba.cola.domain.Entity;
import lombok.Data;

@Data
@Entity
public class User {
    private Long id;
    private String name;
}
