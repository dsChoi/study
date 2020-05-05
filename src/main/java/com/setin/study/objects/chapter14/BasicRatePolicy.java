package com.setin.study.objects.chapter14;

import com.setin.study.objects.chapter04.Money;

public  abstract class BasicRatePolicy {
    abstract protected Money calculateCallFee(Call cal);
}
