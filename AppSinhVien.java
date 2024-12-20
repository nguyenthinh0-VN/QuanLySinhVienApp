import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import control.InDAO;
import control.InDSSVControl;
import control.ThemMoiSVControl;
import database.*;
import ui.InDSSVCUI;
import ui.MenuCUI;//phụ thuộc
import ui.ThongBaoThemSVCUI;
import ui.ThongTinSVCUI;

public class AppSinhVien {

	public static void main(String[] args) {

		//Khởi tạo CSDL
		ArrayListMockDatabase.initDatabase();

		//sử dụng Class MenuCUI
		PrintWriter pWriterRemote = new PrintWriter(System.out, true);
		Scanner scannerRemote = new Scanner(System.in);
		InDSSVCUI inDSSVCUIRemote = new InDSSVCUI(pWriterRemote);

		//DAO
		ThemMoiSVDAOFile themMoiSVDAOFile = new ThemMoiSVDAOFile("Sinhvien.db");

		//ThemMoiSVDAO themMoiSVDAORemote = new ThemMoiSVDAO();

		ThongBaoThemSVCUI tbThemSVCUI = new ThongBaoThemSVCUI(pWriterRemote);

		InDSSVDAOFile inDSSVDAOFileRemote = new InDSSVDAOFile("Sinhvien.db");
		//InDSSVDAO inDSSVDAORemote = new InDSSVDAO();

		//Controller
		ThemMoiSVControl themMoiSVControlRemote =
				new ThemMoiSVControl(themMoiSVDAOFile);

		themMoiSVControlRemote.setThemDAO(themMoiSVDAOFile);

		themMoiSVControlRemote.setTbThemSVCUI(tbThemSVCUI);

		InDSSVControl inDSSVControlRemote =
				new InDSSVControl(inDSSVDAOFileRemote, inDSSVCUIRemote);

		inDSSVControlRemote.setInDSSVDAO(inDSSVDAOFileRemote);

		//CUI
		ThongTinSVCUI ttSVCUIRemote = new ThongTinSVCUI(pWriterRemote, scannerRemote, themMoiSVControlRemote);
		
		MenuCUI menuCUIRemote = new MenuCUI(pWriterRemote, scannerRemote, ttSVCUIRemote);

		menuCUIRemote.setInDSSVControl(inDSSVControlRemote);

		
		//gửi thông điệp
		menuCUIRemote.controlLoop();

	}

}
