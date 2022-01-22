package com.nhom30.gioHang;

import java.util.ArrayList;

public class GioHang {
	private ArrayList<Item> cart;

	public GioHang() {
		cart = new ArrayList<Item>();
	}

	public void ThemItem(Item item) {

		if (cart.contains(item)) {
			Item item2 = cart.get(cart.indexOf(item));

			item2.setSoLuong(item2.getSoLuong() + 1);
		} else {
			cart.add(item);
		}
	}

	public void deleteItem(Item item) {
		if (cart.contains(item)) {
			cart.remove(cart.indexOf(item));
		}
	}

	public void updateItem(Item item, int soLuong) {
		if (soLuong > 0) {
			if (cart.contains(item)) {
				Item item2 = cart.get(cart.indexOf(item));
				item2.setSoLuong(soLuong);
			}
		}
	}

	public Item getItemById(int id) {
		for (Item item : cart) {
			if (item.getId() == id) {
				return item;
			}
		}
		return null;
	}

	public int soLuongItiem() {
		return cart.size();
	}

	public double TongTien() {
		double tien = 0;
		for (Item item : cart) {
			tien += item.getDonGia() * item.getSoLuong();
		}
		return tien;
	}

	public ArrayList<Item> getGioHang() {
		return cart;
	}
}
