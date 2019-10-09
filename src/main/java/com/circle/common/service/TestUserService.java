package com.circle.common.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.circle.common.domain.TestUser;
import com.circle.common.mapper.TestUserMapper;
import org.springframework.stereotype.Service;

@Service
public class TestUserService extends ServiceImpl<TestUserMapper, TestUser> {
}
