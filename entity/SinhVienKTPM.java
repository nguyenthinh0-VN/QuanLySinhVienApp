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
	protected double tinhDiemTB() {

		return (2 * diemJava + diemHtml + diemCss) / 4;
	}


	@Override
	public String toString() {
		return "Sinh Viên Phần Mềm: " + "Họ Tên: "+ getHoTen() + ", Địa Chỉ: "  + getDiaChi() + ", Ngày Sinh: " + getNgaySinh() + ", Điểm HTML = " + diemHtml +", Điểm CSS = " + diemCss + ", Điểm Java = " + diemJava + " " + ", Học Lực: " + getHoLuc() + "\n";
	}


}
