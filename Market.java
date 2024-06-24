import java.util.ArrayList;
import java.util.List;


public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> actors = new ArrayList<>();

    @Override
    public void takeInQueue(Human actor) {
        actor.add(actor);
    }

    @Override
    public void takeOrders() {
        for(Actor actor: actors){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders(Human actor, List<EProduct> products) {
        for(final Actor actor: actors){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue(Human actor) {
        int indexOfActor = actors.indexOf(actor);
        actor.remove(indexOfActor);
    }

    @Override
    public void acceptToMarket(Human actor) {
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(Human actor) {
        releaseFromQueue(actor);
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders(null, null);
        releaseFromQueue(null);
    }

}