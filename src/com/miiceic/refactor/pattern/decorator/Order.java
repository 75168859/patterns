package com.miiceic.refactor.pattern.decorator;

import java.util.Date;
import java.util.Vector;
import java.text.NumberFormat;
//抽象产品
abstract public class Order {
	/**
	 * @link aggregation
	 * @directed
	 * @supplierCardinality 0..*
	 * @clientCardinality 1
	 */
	private OrderLine lnkOrderLine;
	protected String customerName;
	protected Date salesDate;
	protected Vector items = new Vector(10);

	public void print() {
		for (int i = 0; i < items.size(); i++) {
			OrderLine item = (OrderLine) items.get(i);
			item.printLine();
		}
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	// 增加销售产品
	public void addItem(OrderLine item) {
		items.add(item);
	}

	public void remoteItem(OrderLine item) {
		items.remove(item);
	}

	public double getGrandTotal() {
		double amnt = 0.0D;

		for (int i = 0; i < items.size(); i++) {
			OrderLine item = (OrderLine) items.get(i);
			amnt += item.getSubtotal();
		}

		return amnt;
	}

	protected String formatCurrency(double amnt) {
		return NumberFormat.getCurrencyInstance().format(amnt);
	}

}
