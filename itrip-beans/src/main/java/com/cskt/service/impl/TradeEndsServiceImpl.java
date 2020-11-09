package com.cskt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.domain.TradeEnds;
import com.cskt.mapper.TradeEndsMapper;
import com.cskt.service.TradeEndsService;
@Service
public class TradeEndsServiceImpl extends ServiceImpl<TradeEndsMapper, TradeEnds> implements TradeEndsService{

}
