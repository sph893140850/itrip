package com.cskt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.mapper.LabelDicMapper;
import com.cskt.domain.LabelDic;
import com.cskt.service.LabelDicService;
@Service
public class LabelDicServiceImpl extends ServiceImpl<LabelDicMapper, LabelDic> implements LabelDicService{

}
