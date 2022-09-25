import java.security.InvalidParameterException;

public class Product {
    private String id;
    static class Size {
        float height;
        float width;
        float length;
        float thickness;

        public float getHeight() {
            return height;
        }

        public void setHeight(float height) {
            if (height > 0) this.height = height;
            else throw new InvalidParameterException();
        }

        public float getWidth() {
            return width;
        }

        public void setWidth(float width) {
            if (width > 0) this.width = width;
            else throw new InvalidParameterException();
        }

        public float getLength() {
            return length;
        }

        public void setLength(float length) {
            if (length > 0) this.length = length;
            else throw new InvalidParameterException();
        }

        public float getThickness() {
            return thickness;
        }

        public void setThickness(float thickness) {
            if (thickness > 0) this.thickness = thickness;
            else throw new InvalidParameterException();
        }

        public Size(float height, float width, float length, float thickness) {
            setHeight(height);
            setLength(length);
            setWidth(width);
            setThickness(thickness);
        }
    }
    private Size size;
    private Paste paste;
    private Polish polish;
    private float price;
    private String description;
    private int stock;

    public Product(String id, float length, float width, float height, float thickness, Paste paste,
                   Polish polish, float price, String description, int stock) {
        this.id = id;
        this.size = new Size(height, width, length, thickness);
        this.paste = paste;
        this.polish = polish;
        this.price = price;
        this.description = description;
        this.stock = 0;
    }

    public void setPrice(float price) {
        if (price > 0) this.price = price;
        else throw new InvalidParameterException();
    }

    public void changeStock(Integer amount) {
        if (Math.pow(stock, 2) >= Math.pow(amount, 2)) {
            stock += amount;
        }
        else throw new ArithmeticException();
    }

    public String getId() {
        return id;
    }

    public Size getSize() {
        return size;
    }

    public Paste getPaste() {
        return paste;
    }

    public Polish getPolish() {
        return polish;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }
}
