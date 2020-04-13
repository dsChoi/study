package com.setin.study.objects.chapter09;

import com.setin.study.objects.chapter04.Money;
import com.setin.study.objects.chapter04.Screening;

import java.time.Duration;

public class Movie {
	private DiscountPolicy discountPolicy;

	private Money fee;
	public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy){
		this.discountPolicy = discountPolicy;
		this.fee = fee;
	}

	public Money calucateMovieFee(Screening screening){
		return fee.minus(discountPolicy.calculateDiscountAmount(screening));
	}
}


