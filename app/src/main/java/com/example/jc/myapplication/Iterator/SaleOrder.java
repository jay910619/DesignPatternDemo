package com.example.jc.myapplication.Iterator;

/**
 * @author jc
 * @time 2018/3/30 上午11:33
 * @desc
 */

public class SaleOrder implements SalesController {

  private OrderState mOrderState;

  public SaleOrder() {
    mOrderState = new NewOrder();
  }

  public void setOrderState(OrderState orderState) {
    mOrderState = orderState;
  }


  public void addOrderLine(){
    mOrderState.addOrderLine();
  }

  /**
   * 已下单
   */
  public void register(){
    mOrderState.register();
  }

  /**
   * 已接单
   */
  public void grant(){
    mOrderState.grant();
  }

  /**
   * 发货中
   */
  public void ship(){
    mOrderState.ship();
  }

  /**
   * 运输中
   */
  public void invoice(){
    mOrderState.invoice();
  }

  /**
   *  完成
   */
  public void finish(){
    mOrderState.finish();
  }

  /**
   * 取消
   */
  public void cancel(){
    mOrderState.cancel();
  }


  /**
   * 添加商品到购物车
   */
  @Override public void addToCart() {
    setOrderState(new NewOrder());
  }

  /**
   * 下单
   */
  @Override public void giveAnOrder() {
    setOrderState(new Registered());
  }

  /**
   * 接单
   */
  @Override public void orderReceiving() {
    setOrderState(new Granted());
  }

  /**
   * 打包
   */
  @Override public void packaging() {
    setOrderState(new Shiped());
  }

  /**
   * 运输
   */
  @Override public void transporting() {
    setOrderState(new Invoiced());
  }

  /**
   * 完成
   */
  @Override public void accomplish() {
    setOrderState(new Invoiced());
  }

  /**
   * 取消
   */
  @Override public void canceled() {
    setOrderState(new Canceled());
  }


}
