package ru.netology.bonus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/datatest.csv"})
    public void sqrRange(long amount, boolean registered, long expected) {
        ru.netology.bonus.BonusService service = new ru.netology.bonus.BonusService();

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}