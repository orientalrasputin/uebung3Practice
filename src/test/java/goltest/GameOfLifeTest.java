package goltest;

import gol.GameOfLife;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    public void test0Neighbors(){
        GameOfLife gm = new GameOfLife(0);
        assertThat(gm.numberOfNeighbors()).isEqualTo(0);
    }
}
