import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Colorable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;

public class Grid {

    private Rectangle background;
    private LinkedList<Cell> list = new LinkedList<>();
    private InputHandler inputHandler;
    private int width;
    private int height;
    private int x;
    private int y;
    private static final int padding = 10;
    private int cellSize;



    //Constructor
    public Grid(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.cellSize = width / 20;
        this.background = new Rectangle(x, y, width, height);
        background.draw();
        createCells();

       MouseHandler mouseHandler = new MouseHandler() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

                for (Cell cell : list) {
                    if (isToPaint(mouseEvent, cell) == true) {
                        cell.paint();
                    }
                }
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                for (Cell cell : list) {
                    if (isToPaint(mouseEvent, cell) == true) {
                        cell.paint();
                    }
                }
            }
        };

     inputHandler = new InputHandler(mouseHandler, this, x, y);

       /* MouseMotionListener mouseMotionListener = new MouseMotionListener() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {
                for (Cell cell : list) {
                    if (isToPaint(mouseEvent, cell) == true) {
                        cell.paint();
                    }
                }
            }


            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {
                for (Cell cell : list) {
                    if (isToPaint(mouseEvent, cell) == true) {
                        cell.paint();
                    }

                }
            }
        };*/
    }


    //Getters
    public static int getPadding() {
        return padding;
    }

    //Methods
    public void createCells(){
        int col = 1;
        int row = 1;
        for (int i = 10; i < background.getWidth(); i += cellSize){
            row++;
            for(int j = 10; j < background.getWidth(); j += cellSize){
                Cell cell = new Cell(j,i,30,30, col, row);
                list.add(cell);
                cell.draw();;
                col++;
            }
        }
    }

    public Boolean isToPaint(MouseEvent mouseEvent, Cell cell)
    {
        if(mouseEvent.getX() > cell.getX() && mouseEvent.getX() < (cell.getX() + cellSize) && mouseEvent.getY() > cell.getY() && mouseEvent.getY() < (cell.getY() + cellSize))
        {
            return true;
        } return false;
    }
}
























