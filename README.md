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

```
src/
├── Main/      # Core game logic (UI, GameManager, Player, SceneChanger)
├── Event/     # Event handling (scene interactions)
└── res/       # Images and assets
```

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

## Screenshots

<img width="796" height="595" alt="Screenshot 2026-03-17 at 9 12 42 PM" src="https://github.com/user-attachments/assets/0ba1db30-ed0f-47ba-bf86-59e8955c419d" />

<img width="796" height="595" alt="Screenshot 2026-03-17 at 9 13 18 PM" src="https://github.com/user-attachments/assets/d1eee55c-5396-4351-9cd9-5f12e886cbf9" />

<img width="796" height="595" alt="Screenshot 2026-03-17 at 9 13 26 PM" src="https://github.com/user-attachments/assets/65406b0e-99a0-4da5-b5df-8ec66d9252ad" />

