package dosen;

public class Dosen {
    private String nama;
    private String NIDN;

    public Dosen(String nama, String NIDN){
        this.nama=nama;
        this.NIDN=NIDN;
    }

    public String getNIDN() {
        return NIDN;
    }

    public String getNama() {
        return nama;
    }
}