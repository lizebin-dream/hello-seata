package com.johnny.provider.service.impl;

import com.johnny.provider.domain.TbOrder;
import com.johnny.provider.domain.TbOrderItem;
import com.johnny.provider.service.api.ProviderTransactionService;
import com.johnny.provider.service.api.TbOrderItemService;
import com.johnny.provider.service.api.TbOrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class ProviderTransactionServiceImpl implements ProviderTransactionService {

    @Reference(version = "1.0.0")
    private TbOrderService tbOrderService;

    @Reference(version = "1.0.0")
    private TbOrderItemService tbOrderItemService;

    @Override
    @GlobalTransactional
    public void createOrder(TbOrder tbOrder, TbOrderItem tbOrderItem) {
        tbOrderService.insert(tbOrder);
        tbOrderItemService.insert(tbOrderItem);

        if (tbOrder.getUserId().equals(2L)) {
            throw new RuntimeException("Exception for seata.");
        }
    }
}
