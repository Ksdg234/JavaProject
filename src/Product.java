public class Product {
    private long id;
    private String name;
    private String category;
    private double price;
    private int quantity;

    // --- Getters ---
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // --- Setters с валидацией ---
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название товара не может быть пустым");
        }
        this.name = name;
    }

    public void setCategory(String category) {
        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("Категория не может быть пустой");
        }
        this.category = category;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Цена должна быть больше 0");
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Количество (остаток) не может быть отрицательным");
        }
        this.quantity = quantity;
    }

    // --- Методы вывода ---
    public String getDescription() {
        // Использование String.format позволяет вывести цену красиво (с двумя знаками после запятой)
        return String.format("%s (категория: %s) — %.2f руб., остаток: %d шт.", 
                             name, category, price, quantity);
    }

    @Override
    public String toString() {
        return getDescription();
    }
}