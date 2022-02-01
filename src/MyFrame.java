import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame implements WindowListener {

    Frame frame;
    Label label;
    Button bouton;
    MenuBar menuBar;
    Menu mfile;
    MenuItem mnew;
    MenuItem mopen;
    MyPanel mypanel;
    Color color = Color.WHITE;

    public MyFrame(int t) {

        super();
        frame = new Frame("titre fenetre");
        frame.setBounds(600, 200, 900, 600);
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
        mypanel = new MyPanel(t);
        mypanel.setLayout(new BorderLayout());
        mypanel.add(label, BorderLayout.NORTH);
        mypanel.add(bouton, BorderLayout.SOUTH);
        frame.add(mypanel);
        frame.addWindowListener(this);
        frame.setVisible(true);

    }


    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        frame.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    public class MyPanel extends Panel {

        public MyPanel(int t) {
            super();
            setLayout(new BorderLayout());
            MyCanvas mycanvas = new MyCanvas(t);
            this.add(mycanvas, BorderLayout.CENTER);
            setVisible(true);
        }
    }

    public class MyCanvas extends Canvas {

        private float posx = 20;
        private int t = 0;

        public MyCanvas(int tt) {
            this.t = tt;
            setBackground(Color.BLACK);
            setSize(800, 400);
            setVisible(true);
        }

        public void paint(Graphics g) {
            if (posx > 780) posx = 20;
            g.setColor(color);
            g.fillOval((int) posx, 20, 20, 20);
            posx = posx + (0.01f * t);
            repaint();
        }

    }
}
