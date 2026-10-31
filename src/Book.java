import java.time.Year;

public class Book {
    private long id;
    private String title;
    private String author;
    private int year;

    // --- Getters ---
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // --- Setters с валидацией ---
    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Название не может быть null или пустым");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Автор не может быть null или пустым");
        }
        this.author = author;
    }

    public void setYear(int year) {
        int currentYear = Year.now().getValue();
        if (year < 0 || year > currentYear) {
            throw new IllegalArgumentException("Год должен быть в диапазоне от 0 до " + currentYear);
        }
        this.year = year;
    }

    // --- Методы вывода ---
    public String getDescription() {
        return "\"" + title + "\" — " + author + " (" + year + ")";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}