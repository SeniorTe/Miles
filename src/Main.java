public class Main {
    public static void main(String[] args) {

        int ticketPrice = 15000;
        int discountStep = 20;

        int amountMiles = ticketPrice / discountStep;
        System.out.println("Количество накопленных миль за вашу покупку - " + amountMiles);

    }
}