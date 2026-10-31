public class main {
    public static void main(String[] args) {
        
        // ==========================================
        // БЛОК 1: Задание на паре (Класс Book)
        // ==========================================
        Book book1 = new Book();
        book1.setId(1L);
        book1.setTitle("Война и мир");
        book1.setAuthor("Толстой Л.Н.");
        book1.setYear(1869);

        Book book2 = new Book();
        book2.setId(2L);
        book2.setTitle("Мастер и Маргарита");
        book2.setAuthor("Булгаков М.А.");
        book2.setYear(1967);

        Book book3 = new Book();
        book3.setId(3L);
        book3.setTitle("Преступление и наказание");
        book3.setAuthor("Достоевский Ф.М.");
        book3.setYear(1866);

        System.out.println("=== Список книг (Задание на паре) ===");
        System.out.println("1. " + book1.getDescription());
        System.out.println("2. " + book2.getDescription());
        System.out.println("3. " + book3.getDescription());


        // ==========================================
        // БЛОК 2: Индивидуальное задание (Вариант 3)
        // ==========================================
        Product prod1 = new Product();
        prod1.setId(1L);
        prod1.setName("Ноутбук");
        prod1.setCategory("Электроника");
        prod1.setPrice(85000.00);
        prod1.setQuantity(10);

        Product prod2 = new Product();
        prod2.setId(2L);
        prod2.setName("Кофемашина");
        prod2.setCategory("Бытовая техника");
        prod2.setPrice(24500.50);
        prod2.setQuantity(3);

        Product prod3 = new Product();
        prod3.setId(3L);
        prod3.setName("Офисное кресло");
        prod3.setCategory("Мебель");
        prod3.setPrice(12999.00);
        prod3.setQuantity(0);

        System.out.println("\n=== Список товаров (Вариант 3) ===");
        System.out.println("1. " + prod1.getDescription());
        System.out.println("2. " + prod2.getDescription());
        System.out.println("3. " + prod3.getDescription());
    }
}