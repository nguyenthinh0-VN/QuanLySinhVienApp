package entity;

import java.io.Serializable;
import java.util.Date;

public abstract class SinhVien implements Serializable {
	private String hoTen;
	private String nganh;
	private String diaChi;
	private Date ngaySinh;
	
	//functions
	public SinhVien() {
		
	}

	public SinhVien(String hoTen, String nganh, String diaChi, Date ngaySinh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
	}

	public abstract double tinhDiemTB();

	public String getHocLuc() {
		double diemTB = tinhDiemTB();
        if (diemTB < 5) {
            return "Yếu";
        } else if (diemTB < 6.5) {
            return "Trung bình";
        } else if (diemTB < 7.5) {
            return "Khá";
        } else if (diemTB < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
	}
	
	//protected abstract double tinhDiemTB();


	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}



}
