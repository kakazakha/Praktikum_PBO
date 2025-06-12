import java.util.Scanner;

class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

class InvalidLoanDurationException extends Exception {
    public InvalidLoanDurationException(String message) {
        super(message);
    }
}

public class PeminjamanBuku {
    private static final String[] BOOK_IDS = {"B001", "B002", "B003"};

    public static void validateBookId(String id) throws BookNotFoundException {
        boolean found = false;
        for (String bookId : BOOK_IDS) {
            if (bookId.equalsIgnoreCase(id)) {
                found = true;
                break;
            }
        }
        if (!found) {
            throw new BookNotFoundException("Exception: ID buku tidak ditemukan dalam sistem.");
        }
    }

    public static void validateLoanDuration(int days) throws InvalidLoanDurationException {
        if (days < 1 || days > 14) {
            throw new InvalidLoanDurationException("Exception: Lama peminjaman harus antara 1 - 14 hari.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan nama Anda: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan ID buku: ");
            String idBuku = scanner.nextLine();
            validateBookId(idBuku);

            System.out.print("Masukkan lama peminjaman (hari): ");
            int lama = scanner.nextInt();
            validateLoanDuration(lama);

            System.out.println("Peminjaman berhasil oleh " + nama + " dengan ID buku " + idBuku + " selama " + lama + " hari.");

        } catch (BookNotFoundException | InvalidLoanDurationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: Input tidak valid. " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program selesai.");
        }
    }
}