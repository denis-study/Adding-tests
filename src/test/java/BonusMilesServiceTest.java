import static org.junit.jupiter.api.Assertions.*;

class BonusMilesServiceTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        BonusMilesService service = new BonusMilesService();
        int cost = 10_000;
        int expected = 500;


        int actual = service.calculate(cost);

        boolean passed = expected == actual;

        System.out.println(passed);
    }
}