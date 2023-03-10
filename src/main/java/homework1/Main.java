package homework1;

public class Main {
    private static void ShowProducts(Product[] all) {
        for (Product product : all) {
            System.out.println(product);
            System.out.println("***");
        }
    }

    public static void main(String[] args) {
        Product bread = new Bread("Бородинский", 36.65, 1, "Шт", "10 дней", "1 сорт");
        Product diaper = new Diapers("Merries", 649.0, 38, "Шт", 0, "Да", 0, 0, 3, "Дышаший");
        Product egg = new Egg("Яйца Деревенские", 71.9, 10, "Шт", "14 дней", 10);
        Product mask = new Masks("Маски Гигиенические", 35.0, 3, "Шт", 12);
        Product milk = new Milk("Простоквашино", 94.0, 1, "Литр", "6 месяцев", 2);
        Product pacifier = new Pacifier("Пустышка Paomma", 324.4, 1, "Шт", 0, "Да");
        Product paper = new ToiletPaper("Papia", 1220.99, 32, "Шт", 12, 3);
        Product soda = new Soda("Добрый cola", 82.5, 1, "Литр", 2);
        Product[] all = new Product[] { bread, diaper, egg, mask, milk, pacifier, paper, soda};
        ShowProducts(all);
    }
}