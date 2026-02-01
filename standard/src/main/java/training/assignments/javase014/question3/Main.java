package training.assignments.javase014.question3;

public class Main {
    public static void main(String[] args) {
        try {
            Electronics electronics = new Electronics("SV5698", "META RAYBANDS", 120000, 100, 2, 0.29);
            Clothing clothing = new Clothing("SV6363", "VANS", 2500, 250, "7", "COTTON", "BLACK");
            Books books = new Books("SB4879", "SHADOW SLAVE", 550, 365, "GUILTY THREE", "WEBNOVEL", "7894661231478");

            electronics.reduceStock(65);
            System.out.println();
            clothing.reduceStock(65);
            System.out.println();
            books.reduceStock(65);
            System.out.println();
            electronics.displayInfo();
            System.out.println();
            clothing.displayInfo();
            System.out.println();
            books.displayInfo();
            System.out.println();

        } catch (InvalidProductException ipe) {
            System.out.println("Not a valid product");
        } catch (OutOfStockException ose) {
            System.out.println("Product out of stock");
        }
    }
}
