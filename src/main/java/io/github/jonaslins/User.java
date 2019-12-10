package io.github.jonaslins;

import io.quarkus.mongodb.panache.MongoEntity;
import org.bson.types.ObjectId;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@MongoEntity(collection = "user")
public class User {

    private ObjectId id;

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
