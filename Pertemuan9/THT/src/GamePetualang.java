import java.util.ArrayList;
import java.util.Scanner;

class Akun {
    String username;
    String password;
    String role;

    Akun(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}

class Potion {
    String jenis;

    Potion(String jenis) {
        this.jenis = jenis;
    }

    void gunakan(Pemain p) {
        p.darah += 50;
        p.mana += 10;
        System.out.println("Potion " + jenis + " digunakan!");
    }
}

class Ransel {
    String[] isi = new String[5];

    void tambahItem(String item) {
        for (int i = 0; i < isi.length; i++) {
            if (isi[i] == null) {
                isi[i] = item;
                System.out.println("Kamu mendapatkan item: " + item);
                return;
            }
        }
        System.out.println("Ransel penuh!");
    }

    void tampilkanIsi() {
        System.out.println("Isi Ransel:");
        for (int i = 0; i < isi.length; i++) {
            System.out.println((i + 1) + ". " + (isi[i] == null ? "Kosong" : isi[i]));
        }
    }
}

class Pemain {
    String nama;
    double darah = 100;
    double mana = 100;
    int level = 1;
    Ransel ransel = new Ransel();
    ArrayList<Potion> potions = new ArrayList<>();

    Pemain(String nama) {
        this.nama = nama;
    }

    void gunakanPotion() {
        if (!potions.isEmpty()) {
            Potion p = potions.remove(0);
            p.gunakan(this);
            System.out.println("Potion berhasil digunakan!");
        } else {
            System.out.println("Potion habis!");
        }
    }

    void tampilkanStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Darah: " + darah);
        System.out.println("Mana: " + mana);
        System.out.println("Level: " + level);
    }

    void bukaRansel() {
        System.out.println("*** Info Pemain ***");
        tampilkanStatus();
        System.out.println("Jumlah Potion: " + potions.size());
        ransel.tampilkanIsi();
    }

    void tambahItem(String item) {
        ransel.tambahItem(item);
    }

    void tambahPotion(Potion p) {
        potions.add(p);
        System.out.println("Potion " + p.jenis + " ditambahkan ke tas.");
    }
}

class Penyihir extends Pemain {
    Penyihir(String nama) {
        super(nama);
        this.mana = 150;
    }

    @Override
    void tampilkanStatus() {
        super.tampilkanStatus();
        System.out.println("Role: Penyihir");
    }
}

class Petarung extends Pemain {
    Petarung(String nama) {
        super(nama);
        this.darah = 150;
    }

    @Override
    void tampilkanStatus() {
        super.tampilkanStatus();
        System.out.println("Role: Petarung");
    }
}

class Musuh {
    String nama;
    double darah;
    double mana;
    double serangan;

    Musuh(String nama, double darah, double mana, double serangan) {
        this.nama = nama;
        this.darah = darah;
        this.mana = mana;
        this.serangan = serangan;
    }

    void tampilkanInfo() {
        System.out.println("== Identitas Musuh ==");
        System.out.println("Nama: " + nama);
        System.out.println("Darah: " + darah);
        System.out.println("Mana: " + mana);
        System.out.println("Serangan: " + serangan);
    }
}

class GameManager {
    private Scanner sc = new Scanner(System.in);
    private Akun[] daftarAkun = new Akun[100];
    private int totalAkun = 0;

    void run() {
        while (true) {
            System.out.println("\n==== MENU UTAMA ====");
            System.out.println("1. Login");
            System.out.println("2. Daftar");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilih = sc.nextInt(); sc.nextLine();

            if (pilih == 1) {
                Akun loginAkun = login();
                if (loginAkun != null) {
                    Pemain pemain = buatPemain(loginAkun);
                    pemain.tambahPotion(new Potion("Healing"));
                    pemain.tambahPotion(new Potion("Healing"));
                    mainGame(pemain);
                }
            } else if (pilih == 2) {
                daftar();
            } else if (pilih == 3) {
                System.out.println("Keluar dari game...");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private void daftar() {
        System.out.print("Masukkan username: ");
        String user = sc.nextLine();
        System.out.print("Masukkan password: ");
        String pass = sc.nextLine();

        daftarAkun[totalAkun++] = new Akun(user, pass, null);
        System.out.println("Registrasi berhasil! Silakan login untuk memilih karakter.");
    }

    private Akun login() {
        System.out.print("Masukkan username: ");
        String user = sc.nextLine();
        System.out.print("Masukkan password: ");
        String pass = sc.nextLine();

        for (int i = 0; i < totalAkun; i++) {
            if (daftarAkun[i].username.equals(user) && daftarAkun[i].password.equals(pass)) {
                System.out.println("Login berhasil!");
                if (daftarAkun[i].role == null) {
                    System.out.println("Pilih role karakter:");
                    System.out.println("1. Penyihir");
                    System.out.println("2. Petarung");
                    System.out.print("Pilihan: ");
                    String rolePilihan = sc.nextLine();
                    daftarAkun[i].role = rolePilihan.equals("1") ? "Penyihir" : "Petarung";
                    System.out.println("Role '" + daftarAkun[i].role + "' berhasil dipilih!");
                }
                return daftarAkun[i];
            }
        }
        System.out.println("Login gagal!");
        return null;
    }

    private Pemain buatPemain(Akun akun) {
        return akun.role.equals("Penyihir") ? new Penyihir(akun.username) : new Petarung(akun.username);
    }

    private void mainGame(Pemain p) {
        while (true) {
            System.out.println("\n===== MENU GAME =====");
            System.out.println("1. Buka Ransel");
            System.out.println("2. Mulai Petualangan");
            System.out.println("3. Gunakan Potion");
            System.out.println("4. Keluar Game");
            System.out.print("Pilihan: ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    p.bukaRansel();
                    break;
                case 2:
                    petualangan(p);
                    break;
                case 3:
                    p.gunakanPotion();
                    break;
                case 4:
                    System.out.println("Keluar dari game...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private void petualangan(Pemain p) {
        while (true) {
            System.out.println("\n=== PETUALANGAN ===");
            System.out.println("Pilih arah langkah:");
            System.out.println("1. Maju");
            System.out.println("2. Mundur");
            System.out.println("3. Kiri");
            System.out.println("4. Kanan");
            System.out.println("5. Kembali ke Menu Game");
            System.out.print("Pilihan: ");
            int langkah = sc.nextInt();

            if (langkah == 5) break;

            double random = Math.random();
            if (random < 0.25) {
                String[] itemList = {"Pedang", "Perisai", "Koin Emas", "Potion Kecil"};
                String item = itemList[(int)(Math.random() * itemList.length)];
                p.tambahItem(item);
            } else if (random < 0.5) {
                Potion potion = new Potion("Healing");
                p.tambahPotion(potion);
            } else if (random < 0.75) {
                System.out.println("Kamu tidak menemukan apapun di jalan ini.");
            } else {
                Musuh musuh = new Musuh("Goblin", 50, 20, 15);
                System.out.println("Musuh muncul!");
                musuh.tampilkanInfo();
                while (musuh.darah > 0 && p.darah > 0) {
                    System.out.println("1. Serang");
                    System.out.println("2. Lari");
                    System.out.print("Aksi: ");
                    int aksi = sc.nextInt();
                    if (aksi == 1) {
                        double damage = 20;
                        musuh.darah -= damage;
                        System.out.println("Kamu menyerang musuh dengan " + damage);
                        if (musuh.darah > 0) {
                            p.darah -= musuh.serangan;
                            System.out.println("Musuh membalas! Darah kamu berkurang " + musuh.serangan);
                        } else {
                            System.out.println("Kamu mengalahkan musuh!");
                            p.level++;
                            p.tambahPotion(new Potion("Healing"));
                        }
                    } else {
                        System.out.println("Kamu kabur!");
                        break;
                    }
                }
                if (p.darah <= 0) {
                    System.out.println("Kamu kalah dalam pertarungan...");
                    break;
                }
            }
        }
    }
}

public class GamePetualang {
    public static void main(String[] args) {
        GameManager game = new GameManager();
        game.run();
    }
}