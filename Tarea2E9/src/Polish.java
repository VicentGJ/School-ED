public class Polish {
    private String id;
    private String color;
    private String ingredients;
    private int usedAmount;

    public Polish(String id, String color, String ingredients, int usedAmount) {
        this.id = id;
        this.color = color;
        this.ingredients = ingredients;
        this.usedAmount = usedAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(int usedAmount) {
        this.usedAmount = usedAmount;
    }
}
