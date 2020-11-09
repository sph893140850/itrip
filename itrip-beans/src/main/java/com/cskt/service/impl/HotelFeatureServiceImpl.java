package com.cskt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.mapper.HotelFeatureMapper;
import com.cskt.domain.HotelFeature;
import com.cskt.service.HotelFeatureService;
@Service
public class HotelFeatureServiceImpl extends ServiceImpl<HotelFeatureMapper, HotelFeature> implements HotelFeatureService{

}
