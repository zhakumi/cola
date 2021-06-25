package com.wangcan.infr.customer;

import lombok.Data;

@Data
public class CustomerDO{
  private String customerId;
  private String memberId;
  private String globalId;
  private Long registeredCapital;
  private String companyName;
}
