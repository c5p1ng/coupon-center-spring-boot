package com.c5p1ng.coupon.calculation.template.impl;

import com.c5p1ng.coupon.calculation.template.RuleTemplate;
import com.c5p1ng.coupon.calculation.template.AbstractRuleTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 打折优惠券
 */
@Slf4j
@Component
public class DiscountTemplate extends AbstractRuleTemplate implements RuleTemplate {

    @Override
    protected Long calculateNewPrice(Long totalAmount, Long shopAmount, Long quota) {
        // 计算使用优惠券之后的价格
        Long newPrice = convertToDecimal(shopAmount * (quota.doubleValue()/100));
        newPrice = totalAmount - shopAmount + newPrice;
        log.debug("original price={}, new price={}", totalAmount, newPrice);
        return newPrice;
    }
}
