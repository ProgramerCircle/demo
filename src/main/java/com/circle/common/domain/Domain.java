package com.circle.common.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.ZonedDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
abstract public class Domain extends BaseObject {

    @TableField(fill = FieldFill.INSERT)
    protected ZonedDateTime createdDate;

    @TableField(fill = FieldFill.INSERT)
    protected Long createdBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected ZonedDateTime lastUpdatedDate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected Long lastUpdatedBy;

    @TableField(insertStrategy = FieldStrategy.NOT_NULL)
    @Version
    protected Integer versionNumber;
}
