
class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran sebesar " + amount + " dengan metode umum.");
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran sebesar " + amount + " " + currency + " dengan metode umum.");
    }
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pembayaran " + amount + " dengan Kartu Kredit diproses.");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Pembayaran " + amount + " " + currency + " dengan Kartu Kredit diproses.");
    }
}

class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pembayaran " + amount + " dengan E-Wallet diproses.");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Pembayaran " + amount + " " + currency + " dengan E-Wallet diproses.");
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pembayaran " + amount + " dengan Transfer Bank diproses.");
    }
    
    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Pembayaran " + amount + " " + currency + " dengan Transfer Bank diproses.");
    }
}

    public class Main {
        public static void main(String[] args) {
            PaymentMethod[] methods = {
                new CreditCard(),
                new EWallet(),
                new BankTransfer()
            };
    
            for (PaymentMethod method : methods) {
                method.processPayment(100000);
                method.processPayment(100000, "IDR");
                System.out.println("================================");
            }
        }
    }