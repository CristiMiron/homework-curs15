package ro.fasttrackit.curs15;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("sum method works")
    void simpleSum() {
        assertThat(calculator.sum(1, 1)).isEqualTo(2);
        assertThat(calculator.sum(3, 2)).isEqualTo(5);
        assertThat(calculator.sum(-3, 2)).isEqualTo(-1);
    }

    @Test
    @DisplayName("minus method works")
    void simpleSubstraction() {
        assertThat(calculator.diff(5, 1)).isEqualTo(4);
    }

    @Test
    @DisplayName("division method works")
    void simpleImpartire(){
        assertThat(calculator.division(5,2)).isEqualTo(2.5, Offset.offset(.5));
        assertThat(calculator.division(2,0)).isEqualTo(0);
    }

    @Test
    @DisplayName("multiply works")
    void multiply(){
        assertThat(calculator.multiply(2,10)).isEqualTo(20);
        assertThat(calculator.multiply(2,0)).isEqualTo(0);
        assertThat(calculator.multiply(0,2)).isEqualTo(0);
    }
}
