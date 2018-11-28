public class TobaccoStall extends Stall implements ISecurity{
    public TobaccoStall(String name, String ownerName, String parkingSpot){
        super(name, ownerName, parkingSpot);
}
    public boolean isAllowedTo(Visitor visitor){
        if (visitor.age >= 18){
            return true;
        } return false;
    }
}
