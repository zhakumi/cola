package com.wangcan.client.dto;

import com.alibaba.cola.dto.Query;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserByIdQry extends Query{
   private Long id;
}
