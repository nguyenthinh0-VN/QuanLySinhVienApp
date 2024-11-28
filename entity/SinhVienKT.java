package entity;

import java.util.Date;

public class SinhVienKT extends SinhVien{
	private double diemMarketing;
	private double diemSales;
	

	public SinhVienKT(String hoTen, String diaChi, Date ngaySinh, double diemMarketing, double diemSales) {
		super(hoTen, "KT", diaChi, ngaySinh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}
	
	@Override
	protected double tinhDiemTB() {
		return (2 * diemMarketing + diemSales) / 3;
	}


	@Override
	public String toString() {
		return "Sinh Viên Kinh Tế: " + "Họ Tên: "+ getHoTen() + ", Địa Chỉ: "  + getDiaChi() + ", Ngày Sinh: " + getNgaySinh()+ ", Điểm Marketting = " + diemMarketing + ", Điểm Sales = " + diemSales + " " +", Học Lực: " + getHoLuc() + "\n";
	}

}
