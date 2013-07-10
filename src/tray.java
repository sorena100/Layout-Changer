package layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

import sun.awt.X11.Screen;
import sun.awt.datatransfer.ClipboardTransferable;

import java.io.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.io.IOException;
import java.util.Timer;

public class tray extends JFrame {
  TrayIcon trayIcon;
    SystemTray tray;
	ActionListener cliplistener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			clipboard cl = new clipboard();
			try {
				cl.clipmethod();
			} catch (UnsupportedFlavorException | IOException e1) {
				e1.printStackTrace();
			}
		/*	Transferable clipData = clipboard.getContents(this);
		      String s;
		      try {
		        s = (String) (clipData.getTransferData(DataFlavor.stringFlavor));
		      } 
		      catch (Exception ex) {
		        s = ex.toString();
		      }
		      Character[] ch = cl.toCharacterArray(s);
		      String str = cl.translate(ch);
		      StringSelection data = new StringSelection(str);
		      clipboard.setContents(data, data);*/
		}
	};
	public tray() {
	    //window
	    super("Layout Changer");
	    setSize(700, 500);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLocation(520, 300);
	    
	    
	    //tray
	    try{
	        
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    }
	    catch(Exception e){
	        
	    }
	    if(SystemTray.isSupported()){
	        
	        tray=SystemTray.getSystemTray();
	
	        Image image = Toolkit.getDefaultToolkit().getImage("tray.png");
	        ActionListener exitListener=new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	               
	                System.exit(0);
	            }
	        };
	        PopupMenu popup=new PopupMenu();
	        MenuItem defaultItem=new MenuItem("خروج");
	        defaultItem.addActionListener(exitListener);
	        popup.add(defaultItem);
	        defaultItem=new MenuItem("پنجره اصلی");
	        defaultItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                setVisible(true);
	                setExtendedState(JFrame.NORMAL);
	            }
	        });
	        popup.add(defaultItem);     
	        trayIcon=new TrayIcon(image, "Layout Changer", popup);
	        trayIcon.setImageAutoSize(true);
	        trayIcon.addActionListener(cliplistener);
	    }else{
	    }
	    addWindowStateListener(new WindowStateListener() {
	        public void windowStateChanged(WindowEvent e) {
	            if(e.getNewState()==ICONIFIED){
	                try {
	                    tray.add(trayIcon);
	                    setVisible(false);
	                } catch (AWTException ex) {
	                }
	            }
	    if(e.getNewState()==7){
	                try{
	        tray.add(trayIcon);
	        setVisible(false);
	        }catch(AWTException ex){
	    }
	        }
	    if(e.getNewState()==MAXIMIZED_BOTH){
	                tray.remove(trayIcon);
	                setVisible(true);
	            }
	            if(e.getNewState()==NORMAL){
	                tray.remove(trayIcon);
	                setVisible(true);
	            }
	        }
	    });
	    
		
		}

}
