package entity;

import java.util.Date;

public class SinhVienKT extends SinhVien{
	private double diemMarketing;
	private double diemSales;

	@Override
	public double tinhDiemTB() {
		return (2 * diemMarketing + diemSales) / 3;
	}

	public SinhVienKT(String hoTen, String diaChi, Date ngaySinh, double diemMarketing, double diemSales) {
		super(hoTen, "KT", diaChi, ngaySinh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}


	public double getDiemMarketing() {
		return diemMarketing;
	}


	public double getDiemSales() {
		return diemSales;
	}



}
