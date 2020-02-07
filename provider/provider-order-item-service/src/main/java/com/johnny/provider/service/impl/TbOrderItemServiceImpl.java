package com.johnny.provider.service.impl;

import com.johnny.provider.domain.TbOrderItem;
import javax.annotation.Resource;
import com.johnny.provider.mapper.TbOrderItemMapper;
import com.johnny.provider.service.api.TbOrderItemService;
import org.apache.dubbo.config.annotation.Service;

@Service(version="1.0.0")
public class TbOrderItemServiceImpl implements TbOrderItemService{

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Override
    public void insert(TbOrderItem tbOrderItem) {
        tbOrderItemMapper.insert(tbOrderItem);
    }
}
