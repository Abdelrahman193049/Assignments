import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PhysicsTest {
    @Test
    void threeForcesAtEquilibrium(){
        Physics physics = new Physics();
        int [][]Forces = {{3,-1, 7}, {-5, 2, -4}, {2, -1, -3}};
        assertEquals("Yes", physics.isAtEquilibrium(Forces));
    }
    @Test
    void threeForcesNotAtEquilibrium(){
        Physics physics = new Physics();
        int [][]Forces = {{4, 1, 7}, {-2, 4, -1}, {1, -5, -3}};
        assertEquals("No", physics.isAtEquilibrium(Forces));
    }
    @Test
    void fourForcesOfValueZero(){
        Physics physics = new Physics();
        int [][]Forces = {{0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}};
        assertEquals("Yes", physics.isAtEquilibrium(Forces));
    }
    @Test
    void fourForcesInNegativeDirection(){
        Physics physics = new Physics();
        int [][]Forces = {{-3,-1, -7}, {-5, -6, -4}, {-2, -1, -3}, {-7,-
                8,-9}};
        assertEquals("No", physics.isAtEquilibrium(Forces));
    }
    @Test
    void fourForcesInPositiveDirection(){
        Physics physics = new Physics();
        int [][]Forces = {{3,1, 7}, {5, 6, 4}, {2, 1, 3}, {7,8,9}};
        assertEquals("No", physics.isAtEquilibrium(Forces));
    }
    @Test
    void fiveForcesAtEquilibrium(){
        Physics physics = new Physics();
        int [][]Forces = {{3,-1, 7}, {-5, 2, -4}, {2, -1, -3}, {-1,-1,-1},
                {1,1,1}};
        assertEquals("Yes", physics.isAtEquilibrium(Forces));
    }
    @Test
    void threeRandomForces(){
        Physics physics = new Physics();
        int [][]Forces = {{3,-1, 7}, {-5, 2, -4}, {2, 1, 1}};
        assertEquals("Yes", physics.isAtEquilibrium(Forces));
    }
}