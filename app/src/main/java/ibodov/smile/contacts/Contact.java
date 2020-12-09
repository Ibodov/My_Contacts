package ibodov.smile.contacts;

public class Contact {
    private int id;
    private String name;
    private String lastName;
    private String mail;
    private String number;

    // Генерация Конструктора (Alt + Insert)
    public Contact(int id, String name, String lastName, String mail, String number) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.number = number;
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

    public String getMail() { return mail;}

    public String getNumber() { return number;}

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
    public void setMail(String mail) { this.mail = mail;}

    public void setNumber(String number) {
        this.number = number;
    }
}

