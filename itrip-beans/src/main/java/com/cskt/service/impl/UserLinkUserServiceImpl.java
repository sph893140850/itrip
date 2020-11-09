package com.cskt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.mapper.UserLinkUserMapper;
import com.cskt.domain.UserLinkUser;
import com.cskt.service.UserLinkUserService;
@Service
public class UserLinkUserServiceImpl extends ServiceImpl<UserLinkUserMapper, UserLinkUser> implements UserLinkUserService{

}
