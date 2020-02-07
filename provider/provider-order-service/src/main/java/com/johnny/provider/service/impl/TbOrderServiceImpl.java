package com.johnny.provider.service.impl;

import com.johnny.provider.domain.TbOrder;
import javax.annotation.Resource;
import com.johnny.provider.mapper.TbOrderMapper;
import com.johnny.provider.service.api.TbOrderService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TbOrderServiceImpl implements TbOrderService{

    @Resource
    private TbOrderMapper tbOrderMapper;

    @Override
    public void insert(TbOrder tbOrder) {
        tbOrderMapper.insert(tbOrder);
    }
}
