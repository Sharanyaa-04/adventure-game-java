# Adventure Game (Java Swing)

A GUI-based adventure game built using Java Swing.  
The game includes multiple scenes, an inventory system, and progression-based unlocking.

## Features

- Multiple scenes with smooth transitions
- Inventory system (Sword, Shield, Lantern)
- Health system with visual indicators
- Scene locking based on player progress
- Right-click interaction system for actions

## Game Flow

- Start in Scene 1 and interact with objects
- Defeat the guard to unlock Scene 2
- Search the bushes to find the lantern
- Enter the cave to reach the final scene

## Project Structure

src/
├── Main/ # Core game logic (UI, GameManager, Player, SceneChanger)
├── Event/ # Event handling (scene interactions)
└── res/ # Images and assets


## How to Run

### Step-by-step

javac -d bin $(find src -name "*.java")
cp -r src/res bin/
java -cp bin Main.GameManager

### Quick Run (one command)


rm -rf bin && mkdir bin && javac -d bin $(find src -name "*.java") && cp -r src/res bin/ && java -cp bin Main.GameManager


## Technologies Used

- Java
- Swing (GUI)
- Event-driven programming

## Future Improvements

- Add animations and sound effects
- Improve UI design and transitions
- Add more levels and enemies
- Implement scoring or achievements