public class Kucing extends Hewan {
    
        Kucing(String nama) {
        super(nama);
    }   

    @Override
    void bersuara() {
        System.out.println(nama + " Suara Kucing BERI SIX");
    }

    
}