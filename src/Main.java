public class Main {
    public static void main(String[] args) {

        if (possibility()) {
            System.out.println("Имеется достаточно средств для покупки делового гардероба");
            System.out.println("Остаток от покупки - " + balance());}
        else {
            System.out.println("Недостаточно средств для покукпи делового гардероба");
            System.out.println(" - ");
        };
    }


    static float coat = 70; // пальто
    static byte coatDiscount = 77; // скидка в процентах
    static float hat = 25; // шляпа
    static byte hatDiscount = 37;
    static float businessSuit = 53; // деловой костюм
    static byte businessSuitDiscount = 44;
    static float chemise = 19; // сорочка
    static float shoes = 41; // туфли
    static byte shoesDiscount = 32;
    static float account = 312; // счет пользователя

// подсчет стоимости делового гардероба

    private static float calculation() {
        float count = (coat * (100 - coatDiscount) + hat * (100 - hatDiscount) +
                hat * (100 - hatDiscount) + chemise + shoes * (100 - shoesDiscount)) / 100;
        return count; }

// определение возможности покупки

    private static boolean possibility() {
        if (calculation() <= account) {
            return true;
        } else {
            return false;
        }
    }
//определение возможной сдачи

    private static float balance() {
        if (possibility()) {
            return account - calculation();
        } else {
            return -1;
        }
    }
}
