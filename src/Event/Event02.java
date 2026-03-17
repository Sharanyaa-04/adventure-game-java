// package Event;

// import Main.GameManager;

// public class Event02 {
//     public GameManager gm;

//     public Event02(GameManager gm){
//         this.gm = gm;
//     }

//     public void lookCave(){
//         gm.ui.messageText.setText("It's a cave!");
//     }
//     public void enterCave(){
//        // gm.ui.messageText.setText("You hear the echo of your voice.");
//         if(gm.player.hasLantern==0) {
//             gm.ui.messageText.setText("It's too dark to enter.");
//         }
//         else {
//             gm.sChanger.showScreen3();
//         }
//     }
//     public void talkCave(){
// //        if(gm.player.hasLantern==0) {
// //            gm.ui.messageText.setText("It's too dark to enter.");
// //        }
// //        else {
// //            gm.sChanger.showScreen3();
// //        }
//         gm.ui.messageText.setText("You hear the echo of your voice.");
//        // gm.ui.messageText.setText("It's too dark to enter.");
// //        System.out.println("Player hasLantern: " + gm.player.hasLantern);
// //        if (gm.player.hasLantern == 1) {
// //            gm.sChanger.showScreen3();
// //            System.out.println("Entering Scene 3");
// //        } else {
// //            gm.ui.messageText.setText("It's too dark to enter.");
// //        }
//     }
//     public void lookRoot(){
//         //gm.ui.messageText.setText("There is something under the bush.");
//         gm.ui.messageText.setText("This is a big bush.");
//     }
//     public void talkRoot(){
//         gm.ui.messageText.setText("They say plant grows well if you talk to it but this plant doesn't look like it needs encouragement.");
//     }
//     public void searchRoot(){
//         if(gm.player.hasLantern==0) {
//             gm.ui.messageText.setText("You find a lantern!");
//             gm.player.hasLantern=1;
//             gm.player.updatePlayerStatus();
//         }
//         else{
//             gm.ui.messageText.setText("You didn't find anything.");
//         }
//     }

// }

package Event;

import Main.GameManager;

public class Event02 {

    GameManager gm;

    public Event02(GameManager gm) {
        this.gm = gm;
    }

    // ================= CAVE =================

    public void lookCave() {
        gm.ui.messageText.setText("The cave looks dark and dangerous...");
    }

    public void talkCave() {
        gm.ui.messageText.setText("Talking to a cave? Nothing happens.");
    }

    public void enterCave() {

    if (gm.player.hasLantern == 0) {
        gm.ui.messageText.setText("It's too dark. You need a lantern!");
    } else {
        gm.sChanger.showScreen3();
    }
    }
    // ================= BUSH / ROOT =================

    public void lookRoot() {
        gm.ui.messageText.setText("There is something hidden in the bush...");
    }

    public void talkRoot() {
        gm.ui.messageText.setText("It does not respond.");
    }

    public void searchRoot() {

    if (gm.player.hasLantern == 0) {

        gm.ui.messageText.setText("You found a lantern!");

        gm.player.hasLantern = 1;
        gm.player.updatePlayerStatus();

    } else {
        gm.ui.messageText.setText("There is nothing else here.");
    }
}

}
