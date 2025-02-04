package NotePad;

import java.awt.Color;

public class ColorFunction {
    GUI gui;
    
    public ColorFunction(GUI gui){
        this.gui=gui;

    }
    public void changeColor(String color){
         switch(color){
            case"White":
                gui.textArea.setBackground(Color.WHITE);
                gui.textArea.setForeground(Color.BLACK);
                break;
            case"Black":
                gui.textArea.setBackground(Color.BLACK);
                gui.textArea.setForeground(Color.WHITE);
                break;
            case"Grey":
                gui.textArea.setBackground(Color.GRAY);
                gui.textArea.setForeground(Color.BLACK );
                break;
         }
    }
    public void barColor(String color){
        switch(color){
            case"White":
                for (int i = 0; i < gui.menuBar.getMenuCount(); i++) {
                    gui.menuBar.setBackground(java.awt.Color.WHITE);
                    gui.menuBar.getMenu(i).setForeground(java.awt.Color.BLACK);
                }
                for(int i=0;i<gui.File.getItemCount();++i){
                    gui.File.getItem(i).setBackground(java.awt.Color.WHITE);
                    gui.File.getItem(i).setForeground(java.awt.Color.BLACK);
                }
                for(int i=0;i<gui.Edit.getItemCount();++i){
                    gui.Edit.getItem(i).setBackground(java.awt.Color.WHITE);
                    gui.Edit.getItem(i).setForeground(java.awt.Color.BLACK);
                }
                for(int i=0;i<gui.Color.getItemCount();++i){
                    gui.Color.getItem(i).setBackground(java.awt.Color.WHITE);
                    gui.Color.getItem(i).setForeground(java.awt.Color.BLACK);
                }
                for(int i=0;i<gui.Font.getItemCount();++i){
                    gui.Font.getItem(i).setBackground(java.awt.Color.WHITE);
                    gui.Font.getItem(i).setForeground(java.awt.Color.BLACK);
                }
                for(int i=0;i<gui.FontSize.getItemCount();++i){
                    gui.FontSize.getItem(i).setBackground(java.awt.Color.WHITE);
                    gui.FontSize.getItem(i).setForeground(java.awt.Color.BLACK);
                }
                break;
            case"Black":
                
                for (int i = 0; i < gui.menuBar.getMenuCount(); i++) {
                    gui.menuBar.setBackground(java.awt.Color.BLACK);
                    gui.menuBar.getMenu(i).setForeground(java.awt.Color.WHITE);
                }
                for(int i=0;i<gui.File.getItemCount();++i){
                    gui.File.getItem(i).setBackground(java.awt.Color.BLACK);
                    gui.File.getItem(i).setForeground(java.awt.Color.WHITE);
                }
                for(int i=0;i<gui.Edit.getItemCount();++i){
                    gui.Edit.getItem(i).setBackground(java.awt.Color.BLACK);
                    gui.Edit.getItem(i).setForeground(java.awt.Color.WHITE);
                }
                for(int i=0;i<gui.Color.getItemCount();++i){
                    gui.Color.getItem(i).setBackground(java.awt.Color.BLACK);
                    gui.Color.getItem(i).setForeground(java.awt.Color.WHITE);
                }
                for(int i=0;i<gui.Font.getItemCount();++i){
                    gui.Font.getItem(i).setBackground(java.awt.Color.BLACK);
                    gui.Font.getItem(i).setForeground(java.awt.Color.WHITE);
                }
                for(int i=0;i<gui.FontSize.getItemCount();++i){
                    gui.FontSize.getItem(i).setBackground(java.awt.Color.BLACK);
                    gui.FontSize.getItem(i).setForeground(java.awt.Color.WHITE);
                }
                break;
            case"Grey":
               for (int i = 0; i < gui.menuBar.getMenuCount(); i++) {
                    gui.menuBar.setBackground(java.awt.Color.GRAY);
                    gui.menuBar.getMenu(i).setForeground(java.awt.Color.BLACK);
                }
                for(int i=0;i<gui.File.getItemCount();++i){
                    gui.File.getItem(i).setBackground(java.awt.Color.GRAY);
                    gui.File.getItem(i).setForeground(java.awt.Color.BLACK);
                }
                for(int i=0;i<gui.Edit.getItemCount();++i){
                    gui.Edit.getItem(i).setBackground(java.awt.Color.GRAY);
                    gui.Edit.getItem(i).setForeground(java.awt.Color.BLACK);
                }
                for(int i=0;i<gui.Color.getItemCount();++i){
                    gui.Color.getItem(i).setBackground(java.awt.Color.GRAY);
                    gui.Color.getItem(i).setForeground(java.awt.Color.BLACK);
                }
                for(int i=0;i<gui.Font.getItemCount();++i){
                    gui.Font.getItem(i).setBackground(java.awt.Color.GRAY);
                    gui.Font.getItem(i).setForeground(java.awt.Color.BLACK);
                }
                for(int i=0;i<gui.FontSize.getItemCount();++i){
                    gui.FontSize.getItem(i).setBackground(java.awt.Color.GRAY);
                    gui.FontSize.getItem(i).setForeground(java.awt.Color.BLACK);
                }
                break;
        }
    }
    
}
