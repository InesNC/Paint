import org.academiadecodigo.simplegraphics.graphics.Text;

public class Options extends Text {

    private Options save;
    private Options delete;
    private Options blue;
    private Options green;
    private Options red;

    public Options(double v, double v1, String s) {
        super(v, v1, s);
            save = new Options(10, 10,"Save");
            delete = new Options(10,10,"Delete");
            blue = new Options(10,10,"Color blue");
            green = new Options(10,10,"Color green");
            red = new Options(10,10,"Color red");
            save.draw();
            delete.draw();
            blue.draw();
            green.draw();
            red.draw();
    }




}
