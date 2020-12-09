package ibodov.smile.contacts;

public class Contact {
    private int id;
    private String name;
    private String lastName;

    // Генерация Конструктора (Alt + Insert)
    public Contact(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    // Генерация Геттеров (Alt + Insert)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    // Генерация Сеттеров (Alt + Insert)
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

