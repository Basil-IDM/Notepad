package NotePad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.undo.UndoManager;
import javax.swing.event.UndoableEditListener;
import javax.swing.event.UndoableEditEvent;


public class GUI implements ActionListener{
    
    JFrame frame;
    JTextArea textArea;
    JScrollPane scrollPane;
    boolean wordWrapOn = false;
    JMenuBar menuBar;//MENU BAR
    JMenu File, Edit,Color,Font, FontSize;/*TOP MENU BAR*/
    JMenuItem New, Open, Save, SaveAs, Exit,FontArial, FontCMCS, FontTNR, FontSize8, FontSize12, 
    FontSize16, FontSize20, FontSize24, FontSize28 ,/*FORMAT MENU*/Color1, Color2, Color3, /*EDIT MENU */
    Undo,Redo;
    
    Function function = new Function(this);
    FontFunction functionFont=new FontFunction(this);
    ColorFunction functionColor=new ColorFunction(this);
    EditFunction functionEdit=new EditFunction(this);

    UndoManager um = new UndoManager();

    public static void main(String[] args) {
        new GUI();
    }
    public GUI() {
        frame();
        textArea();
        menuBar();
        fileMenu();
        fontMenu();
        fontSizeMenu();
        colorMenu();
        editMenu();

         
        functionFont.selectedFont = "Arial";
        functionFont.createFont(16);
        functionColor.changeColor("White");
        functionColor.barColor("White");
        
        frame.setVisible(true);

    }
    public void frame() {
        frame = new JFrame("NotePad");
        frame.setSize(900, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void textArea(){
        textArea =new JTextArea();
        textArea.getDocument().addUndoableEditListener(new UndoableEditListener() {
            public void undoableEditHappened(UndoableEditEvent e) {
                um.addEdit(e.getEdit());
            }
        });
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        frame.add(scrollPane);
    }
    public void menuBar() {
        menuBar = new JMenuBar();
        menuBar.setBorder(BorderFactory.createEmptyBorder());
        frame.setJMenuBar(menuBar);

        File= new JMenu("File");
        File.setFont(new java.awt.Font("Serif", 1, 16));
        File.setBorder(BorderFactory.createEmptyBorder(0,0,0,10));
        menuBar.add(File);

        Edit= new JMenu("Edit");
        Edit.setFont(new java.awt.Font("Serif", 1, 16));
        Edit.setBorder(BorderFactory.createEmptyBorder(0,0,0,10));
        menuBar.add(Edit);
        
        Font= new JMenu("Font");
        Font.setFont(new java.awt.Font("Serif", 1, 16));
        Font.setBorder(BorderFactory.createEmptyBorder(0,0,0,10));
        menuBar.add(Font);

        FontSize= new JMenu("Font Size");
        FontSize.setFont(new java.awt.Font("Serif", 1, 16));
        FontSize.setBorder(BorderFactory.createEmptyBorder(0,0,0,10));
        menuBar.add(FontSize);

        Color= new JMenu("Color");
        Color.setFont(new java.awt.Font("Serif", 1, 16));
        Color.setBorder(BorderFactory.createEmptyBorder(0,0,0,10));
        menuBar.add(Color);
    }
    public void fileMenu(){
        New = new JMenuItem("New");
        New.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        New.addActionListener(this);
        New.setActionCommand("New");
        File.add(New);

        Open = new JMenuItem("Open");
        Open.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        Open.addActionListener(this);
        Open.setActionCommand("Open");
        File.add(Open);

        Save = new JMenuItem("Save");
        Save.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        Save.addActionListener(this);
        Save.setActionCommand("Save");
        File.add(Save);

        SaveAs = new JMenuItem("Save As");
        SaveAs.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        SaveAs.addActionListener(this);
        SaveAs.setActionCommand("SaveAs");
        File.add(SaveAs);

        Exit = new JMenuItem("Exit");
        Exit.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        Exit.addActionListener(this);
        Exit.setActionCommand("Exit");
        File.add(Exit);
    }
    public void fontMenu(){

        FontArial = new JMenuItem("Arial");
        FontArial.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        FontArial.addActionListener(this);
        FontArial.setActionCommand("Arial");
        Font.add(FontArial);

        FontCMCS = new JMenuItem("Comic Sans MS");
        FontCMCS.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        FontCMCS.addActionListener(this);
        FontCMCS.setActionCommand("Comic Sans MS");
        Font.add(FontCMCS);

        FontTNR = new JMenuItem("Times New Roman");
        FontTNR.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        FontTNR.addActionListener(this);
        FontTNR.setActionCommand("Times New Roman");
        Font.add(FontTNR);
    }
    public void fontSizeMenu(){

        FontSize8 = new JMenuItem("8");
        FontSize8.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        FontSize8.addActionListener(this);
        FontSize8.setActionCommand("8");
        FontSize.add(FontSize8);

        FontSize12 = new JMenuItem("12");
        FontSize12.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        FontSize12.addActionListener(this);
        FontSize12.setActionCommand("12");
        FontSize.add(FontSize12);

        FontSize16 = new JMenuItem("16");
        FontSize16.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        FontSize16.addActionListener(this);
        FontSize16.setActionCommand("16");
        FontSize.add(FontSize16);

        FontSize20 = new JMenuItem("20");
        FontSize20.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        FontSize20.addActionListener(this);
        FontSize20.setActionCommand("20");
        FontSize.add(FontSize20);

        FontSize24 = new JMenuItem("24");
        FontSize24.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        FontSize24.addActionListener(this);
        FontSize24.setActionCommand("24");
        FontSize.add(FontSize24);

        FontSize28 = new JMenuItem("28");
        FontSize28.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        FontSize28.addActionListener(this);
        FontSize28.setActionCommand("28");
        FontSize.add(FontSize28);
    }
    public void colorMenu(){
        Color1 =new JMenuItem("White");
        Color1.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        Color1.addActionListener(this);
        Color1.setActionCommand("White");
        Color.add(Color1);

        Color2 =new JMenuItem("Black");
        Color2.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        Color2.addActionListener(this);
        Color2.setActionCommand("Black");
        Color.add(Color2);

        Color3 =new JMenuItem("Grey");
        Color3.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        Color3.addActionListener(this);
        Color3.setActionCommand("Grey");
        Color.add(Color3);   
    }
    public void editMenu(){
        Undo = new JMenuItem("Undo");
        Undo.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        Undo.addActionListener(this);
        Undo.setActionCommand("Undo");
        Edit.add(Undo);

        Redo = new JMenuItem("Redo");
        Redo.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        Redo.addActionListener(this);
        Redo.setActionCommand("Redo");
        Edit.add(Redo);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch(command){
            case "New":
                function.New();
                break;
            case "Open":
                    function.Open();
                    break;
            case "Save":
                    function.Save();
                    break;        
            case "SaveAs":
                    function.SaveAs();
                    break;
            case "Exit":
                function.Exit();
                 break;
            case "Arial":
                functionFont.setFont(command);
                break;
            case "Comic Sans MS":
                functionFont.setFont(command);
                break;
            case "Times New Roman":
                functionFont.setFont(command);
                break;  
            case"8":
                functionFont.createFont(8);
                break;
            case"12":
                functionFont.createFont(12);
                break;
            case"16":    
                functionFont.createFont(16);
                break;
            case"20":
                functionFont.createFont(20);
                break;
            case"24":
                functionFont.createFont(24);
                break;
            case"28":
                functionFont.createFont(28);
                break;  
            case"White": 
                functionColor.changeColor(command);
                functionColor.barColor(command);
                break;
            case"Black":
                functionColor.changeColor(command);
                functionColor.barColor(command);
                break;
            case"Grey":
                functionColor.changeColor(command);
                functionColor.barColor(command);
                break;
            case"Undo":
                functionEdit.undo();
                break;
            case"Redo":
                functionEdit.redo();
                break;
        } 
        
    }
    
    
}