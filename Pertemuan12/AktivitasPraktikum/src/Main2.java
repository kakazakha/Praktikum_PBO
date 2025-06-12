public class Main2 {
    public static void main(String[] args) {
        try{
            long[] data = new long[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Memori tida cukup: " + e.getMessage());
        }
    }
}
