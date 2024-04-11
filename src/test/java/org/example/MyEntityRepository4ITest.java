package org.example;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.example.profiles.DefaultProfile4;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
@TestProfile(DefaultProfile4.class)
class MyEntityRepository4ITest {

    @Inject
    MyEntityRepository myEntityRepository;

    @Test
    @Transactional
    void should_persist_in_db() {
        // Given
        MyEntity myEntity = new MyEntity(832105L);

        // When
        myEntityRepository.persist(myEntity);

        // Then
        List<MyEntity> myEntities = myEntityRepository.findAll().list();
        assertThat(myEntities).containsExactlyInAnyOrder(myEntity);
    }
}