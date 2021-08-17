package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[(int) (Math.random() * 20)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
            figures[i].drawFigure();
        }

    }
}
