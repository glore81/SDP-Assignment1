# Game Character Creation System

The project showcases two approaches to the Builder Pattern:
1. **Classical GoF Builder** using an interface (`CharacterBuilder`), concrete builders (`WarriorBuilder`, `MageBuilder`), and a director (`CharacterDirector`).
2. **Static Inner Builder** inside the `Enemy` class for lightweight entity creation.

## Features
* **Fluent API:** Method chaining for readable object construction.
* **Invariant Validation:** Encapsulated domain rules (e.g., required names, minimum strength, minimum mana) that throw descriptive exceptions on invalid states.
* **Preset Configuration:** `CharacterDirector` encapsulates predefined recipes for common game archetypes.

## Architecture Overview
* **`GameCharacter`**: The main product class representing complex player entities.
* **`CharacterBuilder`**: Interface defining steps for building a character, DIP compliant.
* **`WarriorBuilder` / `MageBuilder`**: Concrete builder implementations with class-specific defaults and validation logic.
* **`CharacterDirector`**: Manages the build process to quickly create ready-made character presets.
* **`Enemy`**: Uses its own built-in builder to create enemy entities.

## How to Run
1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Run `Main.java` located in `src/`.
