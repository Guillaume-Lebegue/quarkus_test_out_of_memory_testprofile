package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MY_ENTITY")
public class MyEntity {
    @Id
    public Long id;

    public MyEntity() {
    }

    public MyEntity(Long id) {
        this.id = id;
    }
}
