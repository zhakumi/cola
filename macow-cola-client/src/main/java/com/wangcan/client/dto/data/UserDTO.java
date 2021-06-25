package com.wangcan.client.dto.data;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private Integer age;
}
