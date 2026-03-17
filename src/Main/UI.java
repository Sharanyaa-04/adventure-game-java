// // package Main;

// // import javax.swing.*;
// // import java.awt.*;
// // import java.awt.event.*;
// // import javax.swing.SwingUtilities;


// // public class UI {
// //     GameManager gm;

// //     JFrame window;
// //     public JTextArea messageText;
// //     public JPanel bgPanel[] = new JPanel[10];
// //     public JLabel bgLabel[] = new JLabel[10];

// //     //PLAYER UI
// //     JPanel lifePanel;
// //     JLabel lifeLabel[] =  new JLabel[6];
// //     JPanel inventoryPanel;
// //     public JLabel swordLabel, shieldLabel, lanternLabel;

// //     //game over ui
// //     public JLabel titleLabel;
// //     public JButton restartButton;

// //     public UI(GameManager gm){
// //         this.gm = gm;

// //         createMainField();
// //         createPlayerField();
// //         createGameOverField();
// //         generateScene();

// //         window.setVisible(true);

// //     }
// //     public void createMainField(){
// //         window = new JFrame("Adventure Game");
// //         window.setSize(800, 600);
// //         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// //         window.getContentPane().setBackground(Color.BLACK);
// //         window.setLayout(null);

// //         messageText = new JTextArea("shar arch");
// //         messageText.setBounds(50,410,700,150);
// //         messageText.setBackground(Color.BLACK);
// //         messageText.setForeground(Color.WHITE);
// //         messageText.setEditable(false);
// //         messageText.setLineWrap(true);
// //         messageText.setWrapStyleWord(true);
// //         messageText.setFont(new Font("Book Antique", Font.PLAIN,26));
// //         window.add(messageText);
// //     }
// //     public void createBackground(int bgNum, String bgFilename){
// //         bgPanel[bgNum] = new JPanel();
// //         bgPanel[bgNum].setBounds(50,50,700,350);
// //         bgPanel[bgNum].setBackground(Color.blue);
// //         bgPanel[bgNum].setLayout(null);
// //         bgPanel[bgNum].setVisible(false);
// //         window.add(bgPanel[bgNum]);

// //         bgLabel[bgNum] = new JLabel();
// //         bgLabel[bgNum].setBounds(0,0,700,350);
        
// //        // ImageIcon bgIcon = new ImageIcon("/Users/aligetisharanya/Documents/AdventureGame/res/forest1.jpg");
// //         ImageIcon bgIcon = new ImageIcon(bgFilename);
// //         bgLabel[bgNum].setIcon(bgIcon);



// // //        java.net.URL imgURL = getClass().getClassLoader().getResource("forest1.png");
// // //        if (imgURL != null) {
// // //            ImageIcon bgIcon = new ImageIcon("forest1.png");
// // //            bgLabel[1].setIcon(bgIcon);
// // //        } else {
// // //            System.err.println("Image not found: forest1.png");
// // //        }
// // //
// // //        bgPanel[1].add(bgLabel[1]);

// //     }
// //     public void createObject(int bgNum,int objx,int objy,int objwidth, int objheight,String objFileName, String choice1Name, String choice2Name, String choice3Name,String choice1Command, String choice2Command, String choice3Command){

// //         //create pop menu
// //         JPopupMenu popupMenu = new JPopupMenu();
// //         // create pop menu items
// //         JMenuItem menuItem[]= new JMenuItem[4]; //user [1],[2],[3]
// //         menuItem[1] = new JMenuItem(choice1Name);
// //         menuItem[1].addActionListener(gm.aHandler);
// //         menuItem[1].setActionCommand(choice1Command);
// //         popupMenu.add(menuItem[1]);

// //         menuItem[2] = new JMenuItem(choice2Name);
// //         menuItem[2].addActionListener(gm.aHandler);
// //         menuItem[2].setActionCommand(choice2Command);
// //         popupMenu.add(menuItem[2]);

// //         menuItem[3] = new JMenuItem(choice3Name);
// //         menuItem[3].addActionListener(gm.aHandler);
// //         menuItem[3].setActionCommand(choice3Command);
// //         popupMenu.add(menuItem[3]);

// //          //create objects
// //         JLabel objectLabel = new JLabel();
// //         //objectLabel.setBounds(440,140,200,200);
// //         objectLabel.setBounds(objx,objy,objwidth,objheight);
// //         //objectLabel.setOpaque(true);
// //         //objectLabel.setBackground(Color.blue);

// //         //ImageIcon objectIcon = new ImageIcon("/Users/aligetisharanya/Documents/AdventureGame/res/chest-removebg-preview.png");
// //         ImageIcon objectIcon = new ImageIcon(objFileName);
// //         objectLabel.setIcon(objectIcon);

// //         objectLabel.addMouseListener(new MouseAdapter() {
// //             public void mouseClicked(MouseEvent e) {
// //                 if(SwingUtilities.isRightMouseButton(e)){
// //                     popupMenu.show(objectLabel,e.getX(),e.getY());
// //                 }
// //             }
// //         });

// //         bgPanel[bgNum].add(objectLabel);
// //        // bgPanel[bgNum].add(bgLabel[bgNum]);


// //     }
// //     public void createArrowButton(int bgNum, int x, int y, int width,int height, String arrowFileName, String command){
// //         ImageIcon arrowIcon = new ImageIcon(arrowFileName);

// //         JButton arrowButton = new JButton();
// //         arrowButton.setBounds(x,y,width,height);
// //         arrowButton.setBackground(null);
// //         arrowButton.setContentAreaFilled(false);
// //         arrowButton.setFocusPainted(false);
// //         arrowButton.setIcon(arrowIcon);
// //         arrowButton.addActionListener(gm.aHandler);
// //         arrowButton.setActionCommand(command);
// //         arrowButton.setBorderPainted(false);

// //         bgPanel[bgNum].add(arrowButton);
// //     }
// //      public void createPlayerField(){

// //         lifePanel = new JPanel();
// //         lifePanel.setBounds(50,0,250,50);
// //         lifePanel.setBackground(Color.BLACK);
// //         lifePanel.setLayout(new GridLayout(1,5));
// //         window.add(lifePanel);

// //         ImageIcon lifeIcon = new ImageIcon("/Users/aligetisharanya/Documents/AdventureGame/res/heart.png");
// //         Image image = lifeIcon.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
// //         lifeIcon = new ImageIcon(image);

// //         int i=1;
// //         while(i<6){
// //             lifeLabel[i] = new JLabel();
// //             lifeLabel[i].setIcon(lifeIcon);
// //             lifePanel.add(lifeLabel[i]);
// //             i++;
// //         }

// //         inventoryPanel = new JPanel();
// //         inventoryPanel.setBounds(650,0,100,50);
// //         inventoryPanel.setBackground(Color.BLACK);
// //         inventoryPanel.setLayout(new GridLayout(1,3));
// //         window.add(inventoryPanel);

// //         //CREATE ITEMS

// //          swordLabel = new JLabel();
// //          ImageIcon swordIcon = new ImageIcon("/Users/aligetisharanya/Documents/AdventureGame/res/plain-dagger.png");
// //          image  = swordIcon.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
// //          swordIcon = new ImageIcon(image);
// //          swordLabel.setIcon(swordIcon);
// //          inventoryPanel.add(swordLabel);

// //          shieldLabel = new JLabel();
// //          ImageIcon shieldIcon = new ImageIcon("/Users/aligetisharanya/Documents/AdventureGame/res/shield.png");
// //          image  = shieldIcon.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
// //          shieldIcon = new ImageIcon(image);
// //          shieldLabel.setIcon(shieldIcon);
// //          inventoryPanel.add(shieldLabel);

// //          lanternLabel = new JLabel();
// //          ImageIcon lanternIcon = new ImageIcon("/Users/aligetisharanya/Documents/AdventureGame/res/old-lantern.png");
// //          image  = lanternIcon.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
// //          lanternIcon = new ImageIcon(image);
// //          lanternLabel.setIcon(lanternIcon);
// //          inventoryPanel.add(lanternLabel);

// //      }

// //      public void createGameOverField(){
// //         titleLabel = new JLabel("",JLabel.CENTER);
// //         titleLabel.setBounds(200,150,400,200);
// //         titleLabel.setForeground(Color.red);
// //         titleLabel.setFont(new Font("Times New Roman", Font.PLAIN,70));
// //         titleLabel.setVisible(false);
// //         window.add(titleLabel);

// //         restartButton = new JButton();
// //         restartButton.setBounds(340,320,120,50);
// //         restartButton.setBorder(null);
// //         restartButton.setBackground(null);
// //         restartButton.setForeground(Color.black);
// //         restartButton.setFocusPainted(false);
// //         restartButton.addActionListener(gm.aHandler);
// //         restartButton.setActionCommand("restart");
// //         restartButton.setVisible(false);
// //         window.add(restartButton);
// //      }

// //     public void generateScene(){
// //         //scene 1
// //         createBackground(1,"/Users/aligetisharanya/Documents/AdventureGame/res/bg700x350.jpg");
// //         createObject(1,400,135,250,200,"/Users/aligetisharanya/Documents/AdventureGame/res/hut-307269_1280 (1).png","Look","Talk","Rest","lookHut","talkHut","restHut");
// //         createObject(1,353,262,100,100,"/Users/aligetisharanya/Documents/AdventureGame/res/chest_100x100.png","Look","Talk","Open","lookChest","talkChest","openChest");
// //         createObject(1,110,180,150,150 ,"/Users/aligetisharanya/Documents/AdventureGame/res/guard_150x150.png","Look","Talk","Attack","lookGuard","talkGuard","attackGuard");
// //         createArrowButton(1,0,150,50,50,"/Users/aligetisharanya/Documents/AdventureGame/res/left_arrow.png","goScene2");
// //         bgPanel[1].add(bgLabel[1]);

// //         //scene 2
// //         createBackground(2,"/Users/aligetisharanya/Documents/AdventureGame/res/cave_o_700x350.jpg");
// //         createObject(2,0,100,300,300,"/Users/aligetisharanya/Documents/AdventureGame/res/blank100x100.png","Look","Enter","Talk","lookCave","enterCave","talkCave");
// //         createObject(2,320,150,75,50,"/Users/aligetisharanya/Documents/AdventureGame/res/blank100x100.png","Look","Talk","Search","lookRoot","talkRoot","searchRoot");
// //         createArrowButton(2,650,150,50,50,"/Users/aligetisharanya/Documents/AdventureGame/res/right_arrow.png","goScene1");
// //         //createArrowButton(2,0,150,50,50,"/Users/aligetisharanya/Documents/AdventureGame/res/left arrow.png","goScene3");
// //         bgPanel[2].add(bgLabel[2]);

// //         //scene 3
// //         createBackground(3,"/Users/aligetisharanya/Documents/AdventureGame/res/caveInside.jpg");
// //         createArrowButton(3,650,150,50,50,"/Users/aligetisharanya/Documents/AdventureGame/res/right arrow.png","goScene2");
// //         bgPanel[3].add(bgLabel[3]);
// //     }
// // }
// package Main;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class UI {

//     GameManager gm;

//     JFrame window;
//     public JTextArea messageText;
//     public JPanel bgPanel[] = new JPanel[10];
//     public JLabel bgLabel[] = new JLabel[10];

//     JPanel lifePanel;
//     JLabel lifeLabel[] = new JLabel[6];
//     JPanel inventoryPanel;
//     public JLabel swordLabel, shieldLabel, lanternLabel;

//     public JLabel titleLabel;
//     public JButton restartButton;

//     public UI(GameManager gm) {
//         this.gm = gm;

//         createMainField();
//         createPlayerField();
//         createGameOverField();
//         generateScene();

//         window.setVisible(true);
//     }

//     // ================= MAIN WINDOW =================

//     public void createMainField() {
//         window = new JFrame("Adventure Game");
//         window.setSize(800, 600);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         window.getContentPane().setBackground(Color.BLACK);
//         window.setLayout(null);

//         messageText = new JTextArea("Let's defeat the Demon and save the world!");
//         messageText.setBounds(50, 410, 700, 150);
//         messageText.setBackground(Color.BLACK);
//         messageText.setForeground(Color.WHITE);
//         messageText.setEditable(false);
//         messageText.setLineWrap(true);
//         messageText.setWrapStyleWord(true);
//         messageText.setFont(new Font("Book Antique", Font.PLAIN, 26));
//         window.add(messageText);
//     }

//     // ================= IMAGE LOADER =================

//     private ImageIcon loadImage(String fileName) {
//         java.net.URL url = getClass().getResource("/res/" + fileName);

//         if (url == null) {
//             System.out.println("❌ Image NOT found: " + fileName);
//             return new ImageIcon();
//         }

//         return new ImageIcon(url);
//     }

//     // ================= BACKGROUND =================

//     public void createBackground(int bgNum, String fileName) {

//         bgPanel[bgNum] = new JPanel();
//         bgPanel[bgNum].setBounds(50, 50, 700, 350);
//         bgPanel[bgNum].setLayout(null);
//         bgPanel[bgNum].setVisible(false);
//         window.add(bgPanel[bgNum]);

//         bgLabel[bgNum] = new JLabel();
//         bgLabel[bgNum].setBounds(0, 0, 700, 350);
//         bgLabel[bgNum].setIcon(loadImage(fileName));
//         bgLabel[bgNum].setLayout(null); // IMPORTANT

//         bgPanel[bgNum].add(bgLabel[bgNum]);
//     }

//     // ================= OBJECTS =================

//     public void createObject(int bgNum, int x, int y, int w, int h,
//                              String fileName,
//                              String choice1Name, String choice2Name, String choice3Name,
//                              String choice1Command, String choice2Command, String choice3Command) {

//         JPopupMenu popupMenu = new JPopupMenu();

//         JMenuItem menuItem1 = new JMenuItem(choice1Name);
//         menuItem1.addActionListener(gm.aHandler);
//         menuItem1.setActionCommand(choice1Command);
//         popupMenu.add(menuItem1);

//         JMenuItem menuItem2 = new JMenuItem(choice2Name);
//         menuItem2.addActionListener(gm.aHandler);
//         menuItem2.setActionCommand(choice2Command);
//         popupMenu.add(menuItem2);

//         JMenuItem menuItem3 = new JMenuItem(choice3Name);
//         menuItem3.addActionListener(gm.aHandler);
//         menuItem3.setActionCommand(choice3Command);
//         popupMenu.add(menuItem3);

//         JLabel objectLabel = new JLabel();
//         objectLabel.setBounds(x, y, w, h);
//         objectLabel.setIcon(loadImage(fileName));

//         objectLabel.addMouseListener(new MouseAdapter() {
//             public void mouseClicked(MouseEvent e) {
//                 if (SwingUtilities.isRightMouseButton(e)) {
//                     popupMenu.show(objectLabel, e.getX(), e.getY());
//                 }
//             }
//         });

//         // ADD TO BACKGROUND LABEL (not panel)
//         bgLabel[bgNum].add(objectLabel);
//     }

//     // ================= ARROWS =================

//     public void createArrowButton(int bgNum, int x, int y, int w, int h,
//                                   String fileName, String command) {

//         JButton arrowButton = new JButton();
//         arrowButton.setBounds(x, y, w, h);
//         arrowButton.setBackground(null);
//         arrowButton.setContentAreaFilled(false);
//         arrowButton.setFocusPainted(false);
//         arrowButton.setBorderPainted(false);
//         arrowButton.setIcon(loadImage(fileName));
//         arrowButton.addActionListener(gm.aHandler);
//         arrowButton.setActionCommand(command);

//         // ADD TO BACKGROUND LABEL
//         bgLabel[bgNum].add(arrowButton);
//     }

//     // ================= PLAYER UI =================

//     public void createPlayerField() {

//         lifePanel = new JPanel();
//         lifePanel.setBounds(50, 0, 250, 50);
//         lifePanel.setBackground(Color.BLACK);
//         lifePanel.setLayout(new GridLayout(1, 5));
//         window.add(lifePanel);

//         ImageIcon lifeIcon = loadImage("heart.png");
//         Image img = lifeIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
//         lifeIcon = new ImageIcon(img);

//         for (int i = 1; i < 6; i++) {
//             lifeLabel[i] = new JLabel(lifeIcon);
//             lifePanel.add(lifeLabel[i]);
//         }

//         inventoryPanel = new JPanel();
//         inventoryPanel.setBounds(650, 0, 100, 50);
//         inventoryPanel.setBackground(Color.BLACK);
//         inventoryPanel.setLayout(new GridLayout(1, 3));
//         window.add(inventoryPanel);

//         swordLabel = new JLabel(new ImageIcon(loadImage("plain-dagger.png")
//                 .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
//         inventoryPanel.add(swordLabel);

//         shieldLabel = new JLabel(new ImageIcon(loadImage("shield.png")
//                 .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
//         inventoryPanel.add(shieldLabel);

//         lanternLabel = new JLabel(new ImageIcon(loadImage("old-lantern.png")
//                 .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
//         inventoryPanel.add(lanternLabel);
//     }

//     // ================= GAME OVER =================

//     public void createGameOverField() {
//         titleLabel = new JLabel("", JLabel.CENTER);
//         titleLabel.setBounds(200, 150, 400, 200);
//         titleLabel.setForeground(Color.RED);
//         titleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 70));
//         titleLabel.setVisible(false);
//         window.add(titleLabel);

//         restartButton = new JButton("Restart");
//         restartButton.setBounds(340, 320, 120, 50);
//         restartButton.addActionListener(gm.aHandler);
//         restartButton.setActionCommand("restart");
//         restartButton.setVisible(false);
//         window.add(restartButton);
//     }

//     // ================= SCENES =================

//     public void generateScene() {

//         createBackground(1, "bg700x350.jpg");
//         createObject(1, 400, 135, 250, 200,
//                 "hut.png", "Look", "Talk", "Rest",
//                 "lookHut", "talkHut", "restHut");
//         createObject(1, 353, 262, 100, 100,
//                 "chest_100x100.png", "Look", "Talk", "Open",
//                 "lookChest", "talkChest", "openChest");
//         createObject(1, 110, 180, 150, 150,
//                 "guard_150x150.png", "Look", "Talk", "Attack",
//                 "lookGuard", "talkGuard", "attackGuard");
//         createArrowButton(1, 0, 150, 50, 50,
//                 "left_arrow.png", "goScene2");

//         createBackground(2, "cave_o_700x350.jpg");
//         createArrowButton(2, 650, 150, 50, 50,
//                 "right_arrow.png", "goScene1");

//         createBackground(3, "caveInside.jpg");
//         createArrowButton(3, 650, 150, 50, 50,
//                 "right_arrow.png", "goScene2");
//     }
// }

package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UI {

    GameManager gm;

    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];

    JPanel lifePanel;
    JLabel lifeLabel[] = new JLabel[6];
    JPanel inventoryPanel;
    public JLabel swordLabel, shieldLabel, lanternLabel;

    public JLabel titleLabel;
    public JButton restartButton;

    public UI(GameManager gm) {
        this.gm = gm;

        createMainField();
        createPlayerField();
        createGameOverField();
        generateScene();

        window.setVisible(true);
    }

    // ================= MAIN WINDOW =================

    public void createMainField() {
        window = new JFrame("Adventure Game");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);

        messageText = new JTextArea("Let's defeat the Demon and save the world!");
        messageText.setBounds(50, 410, 700, 150);
        messageText.setBackground(Color.BLACK);
        messageText.setForeground(Color.WHITE);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antique", Font.PLAIN, 26));
        window.add(messageText);
    }

    // ================= IMAGE LOADER =================

    private ImageIcon loadImage(String fileName) {
        java.net.URL url = getClass().getResource("/res/" + fileName);

        if (url == null) {
            System.out.println("❌ Image NOT found: " + fileName);
            return new ImageIcon();
        }

        return new ImageIcon(url);
    }

    // ================= BACKGROUND =================

    public void createBackground(int bgNum, String fileName) {

        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(50, 50, 700, 350);
        bgPanel[bgNum].setLayout(null);
        bgPanel[bgNum].setVisible(false);
        window.add(bgPanel[bgNum]);

        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0, 0, 700, 350);
        bgLabel[bgNum].setIcon(loadImage(fileName));
        bgLabel[bgNum].setLayout(null);

        bgPanel[bgNum].add(bgLabel[bgNum]);
    }

    // ================= OBJECTS =================

    public void createObject(int bgNum, int x, int y, int w, int h,
                             String fileName,
                             String choice1Name, String choice2Name, String choice3Name,
                             String choice1Command, String choice2Command, String choice3Command) {

        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem menuItem1 = new JMenuItem(choice1Name);
        menuItem1.addActionListener(gm.aHandler);
        menuItem1.setActionCommand(choice1Command);
        popupMenu.add(menuItem1);

        JMenuItem menuItem2 = new JMenuItem(choice2Name);
        menuItem2.addActionListener(gm.aHandler);
        menuItem2.setActionCommand(choice2Command);
        popupMenu.add(menuItem2);

        JMenuItem menuItem3 = new JMenuItem(choice3Name);
        menuItem3.addActionListener(gm.aHandler);
        menuItem3.setActionCommand(choice3Command);
        popupMenu.add(menuItem3);

        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(x, y, w, h);
        objectLabel.setIcon(loadImage(fileName));

        objectLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    popupMenu.show(objectLabel, e.getX(), e.getY());
                }
            }
        });

        bgLabel[bgNum].add(objectLabel);
    }

    // ================= ARROWS =================

    public void createArrowButton(int bgNum, int x, int y, int w, int h,
                                  String fileName, String command) {

        JButton arrowButton = new JButton();
        arrowButton.setBounds(x, y, w, h);
        arrowButton.setBackground(null);
        arrowButton.setContentAreaFilled(false);
        arrowButton.setFocusPainted(false);
        arrowButton.setBorderPainted(false);
        arrowButton.setIcon(loadImage(fileName));
        arrowButton.addActionListener(gm.aHandler);
        arrowButton.setActionCommand(command);

        bgLabel[bgNum].add(arrowButton);
    }

    // ================= PLAYER UI =================

    public void createPlayerField() {

        lifePanel = new JPanel();
        lifePanel.setBounds(50, 0, 250, 50);
        lifePanel.setBackground(Color.BLACK);
        lifePanel.setLayout(new GridLayout(1, 5));
        window.add(lifePanel);

        ImageIcon lifeIcon = loadImage("heart.png");
        Image img = lifeIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
        lifeIcon = new ImageIcon(img);

        for (int i = 1; i < 6; i++) {
            lifeLabel[i] = new JLabel(lifeIcon);
            lifePanel.add(lifeLabel[i]);
        }

        inventoryPanel = new JPanel();
        inventoryPanel.setBounds(650, 0, 100, 50);
        inventoryPanel.setBackground(Color.BLACK);
        inventoryPanel.setLayout(new GridLayout(1, 3));
        window.add(inventoryPanel);

        swordLabel = new JLabel(new ImageIcon(loadImage("plain-dagger.png")
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
        inventoryPanel.add(swordLabel);

        shieldLabel = new JLabel(new ImageIcon(loadImage("shield.png")
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
        inventoryPanel.add(shieldLabel);

        lanternLabel = new JLabel(new ImageIcon(loadImage("old-lantern.png")
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
        inventoryPanel.add(lanternLabel);
    }

    // ================= GAME OVER =================

    public void createGameOverField() {
        titleLabel = new JLabel("", JLabel.CENTER);
        titleLabel.setBounds(200, 150, 400, 200);
        titleLabel.setForeground(Color.RED);
        titleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 70));
        titleLabel.setVisible(false);
        window.add(titleLabel);

        restartButton = new JButton("Restart");
        restartButton.setBounds(340, 320, 120, 50);
        restartButton.addActionListener(gm.aHandler);
        restartButton.setActionCommand("restart");
        restartButton.setVisible(false);
        window.add(restartButton);
    }

    // ================= SCENES =================

    public void generateScene() {

        // ===== Scene 1 =====
        createBackground(1, "bg700x350.jpg");
        createObject(1, 400, 135, 250, 200,
                "hut.png", "Look", "Talk", "Rest",
                "lookHut", "talkHut", "restHut");
        createObject(1, 353, 262, 100, 100,
                "chest_100x100.png", "Look", "Talk", "Open",
                "lookChest", "talkChest", "openChest");
        createObject(1, 110, 180, 150, 150,
                "guard_150x150.png", "Look", "Talk", "Attack",
                "lookGuard", "talkGuard", "attackGuard");
        createArrowButton(1, 0, 150, 50, 50,
                "left_arrow.png", "goScene2");

        // Scene 2
createBackground(2, "cave_o_700x350.jpg");

// Cave entrance (smaller area, tighter around opening)
createObject(2, 170, 130, 100, 140,
        "blank100x100.png",
        "Look", "Enter", "Talk",
        "lookCave", "enterCave", "talkCave");
        //2,320,150,75,50

// Bush (moved upward toward tree)
createObject(2, 280, 150, 120, 90,
        "blank100x100.png",
        "Look", "Talk", "Search",
        "lookRoot", "talkRoot", "searchRoot");

createArrowButton(2, 650, 150, 50, 50,
        "right_arrow.png", "goScene1");


        // ===== Scene 3 =====
        createBackground(3, "caveInside.jpg");
        createArrowButton(3, 650, 150, 50, 50,
                "right_arrow.png", "goScene2");
    }
}
