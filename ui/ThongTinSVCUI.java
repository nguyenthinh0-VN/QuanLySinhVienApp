package ui;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import control.ThemMoiSVControl;
import entity.SinhVienKT;
import entity.SinhVienKTPM;

public class ThongTinSVCUI {
	
	//fields
	private PrintWriter screenOutput = null;
	private Scanner keyBoardInput  = null;
	private String hoTenPrompt, nganhPrompt, ngaySinhPrompt,
	diaChiPrompt, diemJavaPrompt, diemCssPrompt, diemHtmlPrompt,
	diemMarketingPrompt, diemSalesPrompt;
	private SimpleDateFormat simpleFormat = null;
	private ThemMoiSVControl themSVControl = null;

	//functions - methods

	public ThongTinSVCUI(PrintWriter _screenOutput, Scanner _keyBoardInput, ThemMoiSVControl _themMoiSVControl) {
		this(_screenOutput, _keyBoardInput);
		this.themSVControl = _themMoiSVControl;
	}


	public ThongTinSVCUI(PrintWriter _screenOutput, Scanner _keyBoardInput) {
		screenOutput = _screenOutput;
		keyBoardInput = _keyBoardInput;
		hoTenPrompt = "Nhập Họ Tên: ";
		nganhPrompt = "Nhập Chuyên Ngành [\"PM\" / \"KT\"]: ";
		ngaySinhPrompt = "Nhập Ngày Sinh (dd/MM/yyyy): ";
		diaChiPrompt = "Nhập Địa Chỉ: ";
		diemJavaPrompt = "Điểm JAVA: ";
		diemCssPrompt = "Điểm CSS: ";
		diemHtmlPrompt = "Điểm HTML: ";
		diemMarketingPrompt = "Điểm MARKETING: ";
		diemSalesPrompt = "Điểm SAELS: ";
		simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
	}


	public void nhapThongTinSV() {
		screenOutput.print(hoTenPrompt);screenOutput.flush();
		String hoTen = keyBoardInput.nextLine();
		screenOutput.print(nganhPrompt);screenOutput.flush();
		String nganh = keyBoardInput.nextLine();
		screenOutput.print(diaChiPrompt);screenOutput.flush();
		String diaChi = keyBoardInput.nextLine();
		
		screenOutput.print(ngaySinhPrompt);screenOutput.flush();
		String ngaySinh = keyBoardInput.nextLine();//"dd/MM/yyyy"
		//chuyển String thành java.util.Date
		Date ngaySinhJava = null;
		try {
			ngaySinhJava =  simpleFormat.parse(ngaySinh);
		} catch (ParseException e) {
			e.printStackTrace();
		}


		if("PM".equalsIgnoreCase(nganh)) {
			screenOutput.print(diemJavaPrompt);screenOutput.flush();
			double diemJava = keyBoardInput.nextDouble();
			screenOutput.print(diemCssPrompt);screenOutput.flush();
			double diemCss = keyBoardInput.nextDouble();
			screenOutput.print(diemHtmlPrompt);screenOutput.flush();
			double diemHtml = keyBoardInput.nextDouble();
			
			
			//gửi thông điệp cho đối tượng ThemMoiSVControl
			//kèm theo dữ liệu là các biến
			themSVControl.taoSinhVien(hoTen, diaChi, ngaySinhJava, diemJava, diemCss, diemHtml);
		}
		
		if("KT".equalsIgnoreCase(nganh)) {
			screenOutput.print(diemMarketingPrompt);screenOutput.flush();
			double diemMarketing = keyBoardInput.nextDouble();
			screenOutput.print(diemSalesPrompt);screenOutput.flush();
			double diemSales = keyBoardInput.nextDouble();
			
			themSVControl.taoSinhVien(hoTen, diaChi, ngaySinhJava, diemMarketing, diemSales);
		}
	}

}
