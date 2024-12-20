package ui;

import entity.SinhVien;
import entity.SinhVienKT;
import entity.SinhVienKTPM;

import java.io.PrintWriter;
import java.util.ArrayList;

public class InDSSVCUI {
    private PrintWriter screenOutput = null;

    public void inDSSV(ArrayList<SinhVien> dssv){
        for (SinhVien sinhVien : dssv) {
            if (sinhVien instanceof SinhVienKT) {
                SinhVienKT svKT = (SinhVienKT) sinhVien;
                screenOutput.printf("Họ tên: %s, Địa chỉ: %s, Ngành: %s, Ngày sinh: %s, Điểm Marketing: %.2f, Điểm Sales: %.2f, Điểm TB: %.2f, Học lực: %s%n",
                        svKT.getHoTen(), svKT.getDiaChi(), svKT.getNganh(), svKT.getNgaySinh().toString(), svKT.getDiemMarketing(), svKT.getDiemSales(), svKT.tinhDiemTB(), svKT.getHocLuc());
            } else if (sinhVien instanceof SinhVienKTPM) {
                SinhVienKTPM svKTPM = (SinhVienKTPM) sinhVien;
                screenOutput.printf("Họ tên: %s, Địa chỉ: %s, Ngành: %s, Ngày sinh: %s, Điểm CSS: %.2f, Điểm HTML: %.2f, Điểm Java: %.2f, Điểm TB: %.2f, Học lực: %s%n",
                        svKTPM.getHoTen(), svKTPM.getDiaChi(), svKTPM.getNganh(), svKTPM.getNgaySinh().toString(), svKTPM.getDiemCss(), svKTPM.getDiemHtml(), svKTPM.getDiemJava(), svKTPM.tinhDiemTB(), svKTPM.getHocLuc());
            } else {
                screenOutput.printf("Họ tên: %s, Địa chỉ: %s, Ngành: %s, Ngày sinh: %s, Điểm TB: %.2f, Học lực: %s%n",
                        sinhVien.getHoTen(), sinhVien.getDiaChi(), sinhVien.getNganh(), sinhVien.getNgaySinh().toString(), sinhVien.tinhDiemTB(), sinhVien.getHocLuc());
            }
        }
    }

    public InDSSVCUI(PrintWriter screenOutput) {
        this.screenOutput = screenOutput;
    }
}