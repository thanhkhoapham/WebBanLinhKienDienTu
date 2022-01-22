package com.nhom30.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
 

@Embeddable
public class ChiTietHoaDon_PK implements Serializable{

	
	private static final long serialVersionUID = 1146978937035796991L;

		@Column(name = "hoaDon_id")
		private int maHd;
		@Column(name = "sanPham_id")
		private int maSp;
		public ChiTietHoaDon_PK() {
			super();
		}
		public ChiTietHoaDon_PK(int maHd, int maSp) { 
			this.maHd = maHd;
			this.maSp = maSp;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + maHd;
			result = prime * result + maSp;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ChiTietHoaDon_PK other = (ChiTietHoaDon_PK) obj;
			if (maHd != other.maHd)
				return false;
			if (maSp != other.maSp)
				return false;
			return true;
		}
		public int getMaHd() {
			return maHd;
		}
		public void setMaHd(int maHd) {
			this.maHd = maHd;
		}
		public int getMaSp() {
			return maSp;
		}
		public void setMaSp(int maSp) {
			this.maSp = maSp;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
}
