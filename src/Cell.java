import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell extends Rectangle{

    private Color color;
    private boolean isPainted = false;
    private int col;
    private int row;



    //Constructor
    public Cell(int x, int y, int width, int height, int col, int row) {
        super(x,y,width,height);
        this.col=col;
        this.row=row;
    }

    //Getters
    public boolean isPainted() {
        return isPainted;
    }

    //Setters
    public void setPainted(boolean painted) {
        isPainted = painted;
    }

    //Methods

    public void paint(){

        if (isPainted() == false) {
                fill();
                setPainted(true);
        } else {
                setColor(color.WHITE);
                fill();
                setColor(color.BLACK);
                draw();
                setPainted(false);
        }
    }
}
