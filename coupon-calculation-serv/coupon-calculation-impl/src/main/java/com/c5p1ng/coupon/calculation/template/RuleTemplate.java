package com.c5p1ng.coupon.calculation.template;


import com.c5p1ng.coupon.calculation.api.beans.ShoppingCart;

public interface RuleTemplate {

    // 计算优惠券
    ShoppingCart calculate(ShoppingCart settlement);
}
