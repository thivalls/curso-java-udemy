package application.program2.entities;

import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date bithday;

    public Client(String name, String email, Date birthday) {
        this.name = name;
        this.email = email;
        this.bithday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getBithday() {
        return bithday;
    }

    /**
     * OVERRIDE METHODS
     */
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
