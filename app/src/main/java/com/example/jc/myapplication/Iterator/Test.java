package com.example.jc.myapplication.Iterator;

import com.example.jc.myapplication.Iterator.SaleOrder;

/**
 * @author jc
 * @time 2018/3/30 上午11:42
 * @desc
 */

public class Test {

  public static void main(String[] args) {
    SaleOrder saleOrder = new SaleOrder();

    saleOrder.addToCart();

    saleOrder.orderReceiving();

    saleOrder.giveAnOrder();

    saleOrder.transporting();

    saleOrder.packaging();

    saleOrder.accomplish();

    saleOrder.cancel();
  }
}
