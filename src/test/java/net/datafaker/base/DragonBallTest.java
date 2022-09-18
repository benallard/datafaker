package net.datafaker.base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DragonBallTest extends BaseFakerTest {

    @Test
    void character() {
        assertThat(faker.dragonBall().character()).matches("^(\\w+\\.?\\s?-?)+$");
    }
}