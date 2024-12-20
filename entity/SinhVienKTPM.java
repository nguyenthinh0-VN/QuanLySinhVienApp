package entity;

import java.util.Date;

public class SinhVienKTPM extends SinhVien {
	private double diemJava;
	private double diemCss;
	private double diemHtml;


	public SinhVienKTPM(String hoTen, String diaChi, Date ngaySinh, double diemJava, double diemCss, double diemHtml) {
		super(hoTen, "PM", diaChi, ngaySinh);
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}

	@Override
	public double tinhDiemTB() {
		return (2 * diemJava + diemHtml + diemCss) / 4;
	}

	public double getDiemJava() {
		return diemJava;
	}

	public double getDiemCss() {
		return diemCss;
	}

	public double getDiemHtml() {
		return diemHtml;
	}

}
