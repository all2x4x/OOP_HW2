import java.util.List;

public class program {


    public static void main(String[] args) {

        Human ivan = new Human("Иван Степанович");
        Human valia = new Human("Валюха");
        Human oly = new Human("Ольга Николаевна");
        Human yra = new Human("Юрий Анатольевич");
        Human mityi = new Human("Митяй");
        Human geny = new Human("Женя");
        Human canych = new Human("Беркович");

        Market borisZhuks = new Market();

        borisZhuks.acceptToMarket(List.of(ivan, valia, oly, yra, geny, mityi));

        borisZhuks.giveOrders(ivan, List.of(EProduct.SUGAR, EProduct.JUICE, EProduct.VODKA));
        borisZhuks.giveOrders(valia, List.of(EProduct.APPLE, EProduct.FILE, EProduct.POTATO, EProduct.MEAT));
        borisZhuks.giveOrder(oly, EProduct.APPLE);
        borisZhuks.giveOrder(yra, EProduct.APPLE);

        borisZhuks.update();

        borisZhuks.releaseFromMarket(valia);
        borisZhuks.releaseFromMarket(oly);

        borisZhuks.acceptToMarket(canych);
        borisZhuks.giveOrder(canych, EProduct.VODKA);

        borisZhuks.update();

        borisZhuks.releaseFromMarket();

        borisZhuks.update();
        
    }
}