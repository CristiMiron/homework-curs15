package ro.fasttrackit.curs15.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TemperatureTest {
    @Test
    @DisplayName("WHEN you put temperature in Celsius THEN will write temperature in Fahrenheit")
    void testFahrenheitToCelsius() {
        Temperature temperature = new Temperature();
        assertThat(temperature.fahrenheitToCelsius(100)).isEqualTo(37.77777777777778);
        assertThat(temperature.fahrenheitToCelsius(0)).isEqualTo(-17.77777777777778);
        assertThat(temperature.fahrenheitToCelsius(50)).isEqualTo(10);
    }

    @Test
    @DisplayName("WHEN you put temperature in Fahrenheit THEN will write temperature in Celsius")
    void testCelsiusToFahrenheit() {
        Temperature temperature = new Temperature();
        assertThat(temperature.celsiusToFahrenheit(1)).isEqualTo(33.8);
        assertThat(temperature.celsiusToFahrenheit(0)).isEqualTo(32);
        assertThat(temperature.celsiusToFahrenheit(50)).isEqualTo(122);
    }
}
