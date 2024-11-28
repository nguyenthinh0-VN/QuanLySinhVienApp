package control;

import database.InDSSVDAO;
import database.XoaSinhVienDAO;
import entity.SinhVien;
import ui.InDSSVCUI;

import java.util.ArrayList;

public class InDSSVControl {
    private InDSSVDAO inDSSV = null;
    private InDSSVCUI inDSSVCUI = null;


    public void getDSSV(){
        ArrayList<SinhVien> dssv = inDSSV.getAllSV();
        inDSSVCUI.inDSSV(dssv);
    }

    public InDSSVControl(InDSSVDAO inDSSV, InDSSVCUI inDSSVCUI) {
        this.inDSSV = inDSSV;
        this.inDSSVCUI = inDSSVCUI;
    }

}
