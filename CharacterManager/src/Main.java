import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        Character c1 = new Character(
            "Arthas", CharacterType.WARRIOR
        );

        Character c2 = new Character(
            "Merlin", CharacterType.MAGE
        );

        Character c3 = new Character(
            "Robin", CharacterType.ARCHER
        );

        System.out.println("=== CHARACTER MANAGER ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
 
        System.out.println("\n=== LEVEL UP ===");
        c1.setLevel(c1.getLevel() + 1);
        System.out.println(c1);

        System.out.println("\n=== MINI CHALLENGE ===");
        Character c4 = new Character(
            "Luna", CharacterType.MAGE
        );

        c4.setMana(80);

        System.out.println(c4);
        System.out.println(
            "Apakah " + c4.getName() +
            " masih hidup? " + c4.isAlive()
        );
    }
}