package ui;

import entity.SinhVien;

import java.io.PrintWriter;
import java.util.ArrayList;

public class InDSSVCUI {
    private PrintWriter screenOutput = null;

    public void inDSSV(ArrayList<SinhVien> dssv){
        for (SinhVien sv : dssv){
            screenOutput.println(sv);
        }
    }

    public InDSSVCUI(PrintWriter screenOutput) {
        this.screenOutput = screenOutput;
    }


}
