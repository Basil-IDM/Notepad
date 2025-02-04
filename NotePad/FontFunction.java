package NotePad;
import java.awt.Font;

public class FontFunction {
    GUI gui;
    Font arial, comicSansMS, timesNewRoman;
    String selectedFont;
    public  FontFunction(GUI gui){
       this.gui=gui;
    }
    
    public void createFont(int fontSize){
        arial = new Font ("Arial", Font.PLAIN, fontSize);
        comicSansMS = new Font ("Comic Sans MS", Font.PLAIN, fontSize);
        timesNewRoman = new Font ("Times New Roman", Font.PLAIN, fontSize);
        setFont(selectedFont);
    }
    public void setFont(String font){
        selectedFont = font;
        switch(selectedFont){
            case "Arial":
                gui.textArea.setFont(arial);
                break;
            case "Comic Sans MS":
                gui.textArea.setFont(comicSansMS);
                break;
            case "Times New Roman":
                gui.textArea.setFont(timesNewRoman);
                break;
        }
    }
}
