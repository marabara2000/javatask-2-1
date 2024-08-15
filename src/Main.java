public class Main {

    public static void main(String[] args) {

        int ticketPrice = 108_957;
        int priceMile = 20;
        int bonus = ticketPrice / priceMile;

        System.out.println(
               " За приобретение билета начислено " + bonus + " бонусных миль "
        );
    }

}
