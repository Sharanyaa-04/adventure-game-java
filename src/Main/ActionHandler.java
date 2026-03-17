// package Main;

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// //import java.awt.event.*;

// public class ActionHandler implements ActionListener {
//      GameManager  gm;
//       public ActionHandler(GameManager gm) {
//           this.gm = gm;
//       }
//       public void actionPerformed(ActionEvent e) {
//          String yourChoice = e.getActionCommand();

//          switch(yourChoice){
//              //scene 1
//              case "lookHut":gm.ev1.lookHut();break;
//              case "talkHut":gm.ev1.talkHut();break;
//              case "restHut":gm.ev1.restHut();break;
//              case "lookChest":gm.ev1.lookChest();break;
//              case "talkChest":gm.ev1.talkChest();break;
//              case "openChest":gm.ev1.openChest();break;
//              case "lookGuard":gm.ev1.lookGuard();break;
//              case "talkGuard":gm.ev1.talkGuard();break;
//              case "attackGuard":gm.ev1.attackGuard();break;
//              //scene 2
//              case "lookCave" : gm.ev2.lookCave();break;
//              case "talkCave" : gm.ev2.talkCave();break;
//              case "enterCave" : gm.ev2.enterCave();break;
//              case "lookRoot" : gm.ev2.lookRoot();break;
//              case "talkRoot" : gm.ev2.talkRoot();break;
//              case "searchRoot" : gm.ev2.searchRoot();break;
//              // Change Scenes
//              case "goScene1": gm.sChanger.showScreen1();break;
//              case "goScene2": gm.sChanger.showScreen2();break;
//             // case "goScene3": gm.sChanger.showScreen3();break;
//              //others
//              case "restart" : gm.sChanger.exitGameOverScreen(); gm.sChanger.showScreen1();break;
//          }
//       }
// }

package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    GameManager gm;

    public ActionHandler(GameManager gm) {
        this.gm = gm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();
        System.out.println("Clicked: " + command); // Debug line (can remove later)

        switch (command) {

            // ================= SCENE 1 =================
            case "lookHut":
                gm.ev1.lookHut();
                break;

            case "talkHut":
                gm.ev1.talkHut();
                break;

            case "restHut":
                gm.ev1.restHut();
                break;

            case "lookChest":
                gm.ev1.lookChest();
                break;

            case "talkChest":
                gm.ev1.talkChest();
                break;

            case "openChest":
                gm.ev1.openChest();
                break;

            case "lookGuard":
                gm.ev1.lookGuard();
                break;

            case "talkGuard":
                gm.ev1.talkGuard();
                break;

            case "attackGuard":
                gm.ev1.attackGuard();
                break;

            // ================= SCENE 2 =================
            case "lookCave":
                gm.ev2.lookCave();
                break;

            case "talkCave":
                gm.ev2.talkCave();
                break;

            case "enterCave":
                gm.ev2.enterCave();
                break;

            case "lookRoot":
                gm.ev2.lookRoot();
                break;

            case "talkRoot":
                gm.ev2.talkRoot();
                break;

            case "searchRoot":
                gm.ev2.searchRoot();
                break;

            // ================= SCENE CHANGES =================
            case "goScene1":
                gm.sChanger.showScreen1();
                break;

            case "goScene2":

                if(gm.player.soldierDefeated == 0){
                    gm.ui.messageText.setText("The guard blocks your path! Defeat him first.");
                    }
                else{
                gm.sChanger.showScreen2();
                    }
                break;


            case "goScene3":
                gm.sChanger.showScreen3();
                break;

            // ================= GAME OVER =================
            case "restart":
                gm.sChanger.exitGameOverScreen();
                gm.sChanger.showScreen1();
                break;

            // ================= DEFAULT (Debug) =================
            default:
                System.out.println("Unknown command: " + command);
                break;
        }
    }
}
