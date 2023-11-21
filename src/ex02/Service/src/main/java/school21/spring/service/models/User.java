package school21.spring.service.models;

public class User {
    private long id;
    private String email;

    public User(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User : { id = " + this.id + ", email = \"" + this.email + "\"}";
    }
}
