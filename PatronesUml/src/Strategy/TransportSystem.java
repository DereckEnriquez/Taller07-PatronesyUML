
package Strategy;

public class TransportSystem {
    private DeliveryStrategy strategy;

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void Do(Location location){
        strategy.ProductDeliveryLocation(location);
        // realiza la accion de Delivery
    }    
}
