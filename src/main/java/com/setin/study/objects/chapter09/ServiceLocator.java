package com.setin.study.objects.chapter09;


public class ServiceLocator {
	private static ServiceLocator soleInstance = new ServiceLocator();
	private DiscountPolicy discountPolicy;

	private ServiceLocator() {
	}

	public static DiscountPolicy discountPolicy() {
		return soleInstance.discountPolicy;
	}

	public static void provide(DiscountPolicy discountPolicy) {
		soleInstance.discountPolicy = discountPolicy;
	}
}