package database;

import control.InDAO;
import entity.SinhVien;

import java.io.*;
import java.util.ArrayList;

public class InDSSVDAOFile implements InDAO {
    private File file = null;


    public InDSSVDAOFile(String fileName) {
        this.file = new File(fileName);
    }


    @Override
    public ArrayList<SinhVien> getDSSV() {
        FileInputStream fileStream = null;
        ObjectInputStream oIS = null;
        ArrayList<SinhVien> dsSv = null;

        try {
            fileStream = new FileInputStream(file);
            oIS = new ObjectInputStream(fileStream);

            dsSv = (ArrayList<SinhVien>) oIS.readObject();

            oIS.close();
            fileStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException eofException) {
            eofException.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return dsSv;
    }

}
