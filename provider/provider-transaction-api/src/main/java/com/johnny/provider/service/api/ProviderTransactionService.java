package com.johnny.provider.service.api;

import com.johnny.provider.domain.TbOrder;
import com.johnny.provider.domain.TbOrderItem;

public interface ProviderTransactionService {

    void createOrder(TbOrder tbOrder, TbOrderItem tbOrderItem);

}
