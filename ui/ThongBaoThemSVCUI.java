package ui;

import java.io.PrintWriter;

public class ThongBaoThemSVCUI {
    private PrintWriter screenOutput = null;

    public void inThongBao(String noiDung){
        screenOutput.println(noiDung);
    }

    public ThongBaoThemSVCUI(PrintWriter screenOutput) {
        this.screenOutput = screenOutput;
    }


}
