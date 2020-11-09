package com.cskt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.mapper.OrderLinkUserMapper;
import com.cskt.domain.OrderLinkUser;
import com.cskt.service.OrderLinkUserService;
@Service
public class OrderLinkUserServiceImpl extends ServiceImpl<OrderLinkUserMapper, OrderLinkUser> implements OrderLinkUserService{

}
