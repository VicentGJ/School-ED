public class Client {
    private String id;
    private String name;
    private String direction;
    private int purchasesAmount;

    public Client(String id, String name, String direction, int purchasesAmount) {
        setId(id);
        setName(name);
        setDirection(direction);
        this.purchasesAmount = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!this.id.isBlank()) this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!this.id.isBlank()) this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        if (!this.id.isBlank()) this.id = id;
    }

    public int getPurchasesAmount() {
        return purchasesAmount;
    }

    public void addPurchase(int purchasesAmount) {
        this.purchasesAmount++;
    }
}
