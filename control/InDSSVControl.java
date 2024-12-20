package control;

import database.InDSSVDAO;
import database.InDSSVDAOFile;
import entity.SinhVien;
import ui.InDSSVCUI;

import java.util.ArrayList;

public class InDSSVControl {
    private InDSSVDAO inDSSV = null;
    private InDSSVCUI inDSSVCUI = null;
    private InDSSVDAOFile inDSSVDAOFile = null;
    private InDAO inDAO = null;

    public InDSSVControl() {
    }

    public InDSSVControl(InDAO inDAO, InDSSVCUI inDSSVCUI) {
        this.inDAO = inDAO;
        this.inDSSVCUI = inDSSVCUI;
    }

    public void setInDSSVDAO(InDAO inDAO) {
        this.inDAO = inDAO;
    }

    public void inDSSV(){
        ArrayList<SinhVien> dssv = inDAO.getDSSV();
        inDSSVCUI.inDSSV(dssv);

    }
}
