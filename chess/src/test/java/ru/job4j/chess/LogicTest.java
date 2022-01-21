package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = OccupiedCellException.class)
    public void whenOccupiedCellException()
        throws OccupiedCellException, ImpossibleMoveException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F8));
        logic.add(new BishopBlack(Cell.E7));
        logic.move(Cell.F8, Cell.D6);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFoundException()
        throws OccupiedCellException, ImpossibleMoveException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F8));
        logic.move(Cell.G7, Cell.H6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMoveException()
        throws OccupiedCellException, ImpossibleMoveException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.D2));
        logic.move(Cell.D2, Cell.D4);
    }
}