package com.circle.common.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
abstract public class BaseObject implements Serializable {
    @TableId
    protected Long id;
}
