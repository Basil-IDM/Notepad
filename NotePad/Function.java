package NotePad;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class Function {
    GUI gui;
    String fileName;
    String fileAddress;
    public Function (GUI gui){
        this.gui = gui;
    } 
    /**
     * 
     */
    public void New() {
        gui.textArea.setText("");
        gui.frame.setTitle("New");
        fileName = null;
        fileAddress = null;
    }
    public void Open() {
        FileDialog fd = new FileDialog(gui.frame, "Open", FileDialog.LOAD);
        fd.setVisible(true);

        if(fd.getFile()!=null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.frame.setTitle(fileName);
        }
        try{
           BufferedReader br = new BufferedReader(new FileReader(fileAddress+fileName));

           gui.textArea.setText("");
              String line = null;
                while((line = br.readLine())!=null){
                    gui.textArea.append(line + "\n");
                }
                br.close();
        }catch(Exception e){
            System.out.println("File not found");
        }

    }
    public void Save(){
        if (fileName == null) {
            SaveAs();
        } else {
            try{
                FileWriter fw = new FileWriter(fileAddress+fileName);
                fw.write(gui.textArea.getText());
                fw.close();
            }catch(Exception e){
                System.out.println("File not found");
            }
            
        }
    }
    public void SaveAs(){
        FileDialog fd =new FileDialog(gui.frame, "Save", FileDialog.SAVE);
        fd.setVisible(true);

        if(fd.getFile()!=null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.frame.setTitle(fileName);
        }
        try{
           FileWriter fw = new FileWriter(fileAddress+fileName);
              fw.write(gui.textArea.getText());
                fw.close();
        }catch(Exception e){
            System.out.println("File not found");
        }

    }
    public void Exit(){
        System.exit(0);
    }
    
    
}
