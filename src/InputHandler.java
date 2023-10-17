import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.EventListener;

public class InputHandler extends Mouse implements MouseListener, MouseMotionListener {

    private int x;
    private int y;

    //Constructor
    public InputHandler(MouseHandler mouseHandler, Grid grid, int x, int y) {
        super(mouseHandler);
        this.x = x;
        this.y = y;
    }
}
