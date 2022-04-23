import static org.junit.jupiter.api.Assertions.*;
public class WatermelonTest {
    @org.junit.jupiter.api.Test
    void main() {
        Watermelon watermelon = new Watermelon();
        assertTrue(watermelon.weight(12));
    }
    @org.junit.jupiter.api.Test
    void even() {
        Watermelon watermelon = new Watermelon();
        assertTrue(watermelon.weight(30));
    }
    @org.junit.jupiter.api.Test
    void odd() {
        Watermelon watermelon = new Watermelon();
        assertFalse(watermelon.weight(9));
    }
    @org.junit.jupiter.api.Test
    void two() {
        Watermelon watermelon = new Watermelon();
        assertFalse(watermelon.weight(2));
    }
    @org.junit.jupiter.api.Test
    void negativeOdd() {
        Watermelon watermelon = new Watermelon();
        assertThrows(IllegalArgumentException.class, () -> {
            watermelon.weight(-3);});
    }
    @org.junit.jupiter.api.Test
    void negativeEven() {
        Watermelon watermelon = new Watermelon();
        assertThrows(IllegalArgumentException.class, () -> {
            watermelon.weight(-8);});
    }

}
