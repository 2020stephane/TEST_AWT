
import java.awt.*;
import java.awt.event.*;


public class Main extends Frame implements WindowListener {

    Frame frame;
    Label label;
    Button bouton;
    MenuBar menuBar;
    Menu mfile;
    MenuItem mnew;
    MenuItem mopen;
    Panel mypanel;

    public Main() {

        super();
        frame = new Frame("titre fenetre");
        frame.setBounds(600,200,400,250);
        label = new Label("Affichez ici le texte du label");
        bouton = new Button("appuyer ici");
        //fenetre.setLayout(new BorderLayout());
        //fenetre.add(label, BorderLayout.NORTH);
        //fenetre.add(bouton, BorderLayout.SOUTH);
        menuBar = new MenuBar();
        mfile = new Menu("File");
        menuBar.add(mfile);
        frame.setMenuBar(menuBar);
        mnew = new MenuItem("New");
        mopen = new MenuItem("Open");
        mfile.add(mnew);
        mfile.add(mopen);
        mypanel = new Panel();
        mypanel.setLayout(new BorderLayout());
        mypanel.add(label, BorderLayout.NORTH);
        mypanel.add(bouton, BorderLayout.SOUTH);
        frame.add(mypanel);
        frame.addWindowListener(this);
        frame.setVisible(true);
    }


    public static void main (String args[]){

       new Main();
    }

    @Override
    public void windowOpened(WindowEvent e) {   }

    @Override
    public void windowClosing(WindowEvent e) { frame.dispose();  }

    @Override
    public void windowClosed(WindowEvent e) {  }

    @Override
    public void windowIconified(WindowEvent e) {   }

    @Override
    public void windowDeiconified(WindowEvent e) {  }

    @Override
    public void windowActivated(WindowEvent e) { }

    @Override
    public void windowDeactivated(WindowEvent e) { }


}

