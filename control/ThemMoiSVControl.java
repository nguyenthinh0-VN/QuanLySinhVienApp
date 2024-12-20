package control;

import java.util.Date;

import database.ThemMoiSVDAO;
import database.ThemMoiSVDAOFile;
import database.ThemMoiSVDAOMySQL;
import entity.SinhVien;
import entity.SinhVienKT;
import entity.SinhVienKTPM;
import ui.ThongBaoThemSVCUI;

public class ThemMoiSVControl {
	
	//Fields
	//private ThemMoiSVDAO themSVDAO = null;
	//private ThemMoiSVDAOFile themSVDAOFile = null;
	private ThongBaoThemSVCUI tbThemSVCUI  = null;
	private ThemDAO themDAO = null;


	public ThemMoiSVControl(ThemDAO themDAO) {
		this.themDAO = themDAO;
	}

	public void setThemDAO(ThemDAO themDAO) {
		this.themDAO = themDAO;
	}

	public void setThemSVDAOFile(ThemDAO themDAO){
		this.themDAO = themDAO;
	}

	public void setTbThemSVCUI(ThongBaoThemSVCUI _tbThemSVCUI) {
		tbThemSVCUI = _tbThemSVCUI;
	}



	public void taoSinhVien(String hoTen, String diaChi, Date ngaySinh, double diemJava, double diemCss, double diemHtml) {
		//tạo đối tượng SinhVienKTPM
		//đối tượng sinh viên phần mềm
		SinhVienKTPM svpm = new SinhVienKTPM(hoTen, diaChi, ngaySinh, diemJava, diemCss, diemHtml);
		doThemSV(svpm);
		
	}
	
	
	public void taoSinhVien(String hoTen, String diaChi, Date ngaySinh, double diemMarketing, double diemSales) {

		//đối tượng sinh viên kinh tế
		SinhVienKT svkt = new SinhVienKT(hoTen, diaChi, ngaySinh, diemMarketing, diemSales);
		doThemSV(svkt);
	}

	public void doThemSV(SinhVien sv) {
		//themSVDAOFile.addSinhVien(sv);
		themDAO.addSinhVien(sv);
		tbThemSVCUI.inThongBao("Them Thanh Cong!!");
	}

}
