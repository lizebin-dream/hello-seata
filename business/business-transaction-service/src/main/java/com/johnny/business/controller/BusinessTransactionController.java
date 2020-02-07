package com.johnny.business.controller;

import com.johnny.provider.domain.TbOrder;
import com.johnny.provider.domain.TbOrderItem;
import com.johnny.provider.service.api.ProviderTransactionService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "transaction")
public class BusinessTransactionController {

    @Reference(version = "1.0.0")
    private ProviderTransactionService providerTransactionService;

    @GetMapping(value = "create/order")
    public String createOrder() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderId(1L);
        tbOrder.setUserId(2L);

        TbOrderItem tbOrderItem = new TbOrderItem();
        tbOrderItem.setOrderId(1L);
        tbOrderItem.setOrderItemId(1L);
        tbOrderItem.setUserId(1L);

        providerTransactionService.createOrder(tbOrder, tbOrderItem);
        return "ok";
    }
}
