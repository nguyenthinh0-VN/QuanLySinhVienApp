import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import control.InDSSVControl;
import control.ThemMoiSVControl;
import database.ArrayListMockDatabase;
import database.InDSSVDAO;
import database.ThemMoiSVDAO;
import ui.InDSSVCUI;
import ui.MenuCUI;//phụ thuộc
import ui.ThongBaoThemSVCUI;
import ui.ThongTinSVCUI;

public class AppSinhVien {

	public static void main(String[] args) {

		//Khởi tạo CSDL
		ArrayListMockDatabase.initDatabase();

		// TODO Auto-generated method stub
		//sử dụng Class MenuCUI
		PrintWriter pWriterRemote = new PrintWriter(System.out, true);
		Scanner scannerRemote = new Scanner(System.in);
		InDSSVCUI inDSSVCUIRemote = new InDSSVCUI(pWriterRemote);

		//DAO
		ThemMoiSVDAO themMoiSVDAORemote = new ThemMoiSVDAO();
		ThongBaoThemSVCUI tbThemSVCUI = new ThongBaoThemSVCUI(pWriterRemote);
		InDSSVDAO inDSSVDAORemote = new InDSSVDAO();

		//Controller
		ThemMoiSVControl themMoiSVControlRemote = new ThemMoiSVControl(themMoiSVDAORemote);
		themMoiSVControlRemote.setTbThemSVCUI(tbThemSVCUI);
		InDSSVControl inDSSVControlRemote = new InDSSVControl(inDSSVDAORemote, inDSSVCUIRemote);


		//CUI
		ThongTinSVCUI ttSVCUIRemote = new ThongTinSVCUI(pWriterRemote, scannerRemote, themMoiSVControlRemote);
		
		MenuCUI menuCUIRemote = new MenuCUI(pWriterRemote, scannerRemote, ttSVCUIRemote);

		menuCUIRemote.setInDSSVControl(inDSSVControlRemote);

		
		//gửi thông điệp
		menuCUIRemote.controlLoop();

	}

}
