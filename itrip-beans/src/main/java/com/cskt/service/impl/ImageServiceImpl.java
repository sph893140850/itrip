package com.cskt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.mapper.ImageMapper;
import com.cskt.domain.Image;
import com.cskt.service.ImageService;
@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image> implements ImageService{

}
