package com.circle.common.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.math.BigDecimal;
import java.sql.Timestamp;


@Data
@TableName("sys_test_user")
public class TestUser extends BaseObject{

    @TableField("employee_no")
    private String employeeNo;

    @TableField("last_name")
    private String lastName;

    @TableField("first_name")
    private String firstName;

    @TableField(value = "birthday")
    private Timestamp birthday;

    @TableField("salary")
    private BigDecimal salary;

}
