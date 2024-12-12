/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("You find yourself standing at the edge of a dark, mysterious forest known as the Forest of Echoes. The wind whispers through the trees, carrying faint voices that seem to call your name. Legends say the forest is enchanted, but no one knows if it leads to treasure—or danger.");
        System.out.println("1: The Path of Shadows");
        System.out.println("2: The River of Whispers");
        System.out.println("3: The Bridge of Light");
        
        int anwser1 = scanner.nextInt();
        
        switch(anwser1) {
            case 1:
                System.out.println("You step cautiously onto the Path of Shadows, where the trees loom over you, their branches twisting like skeletal hands. As you walk deeper, the air grows colder, and the glittering object ahead becomes clearer: a beautiful gemstone resting on a small pedestal. You reach out to grab it, but as your fingers touch the stone, the ground beneath you begins to crumble. Suddenly, the forest around you vanishes, and you find yourself back at the entrance of the forest, empty-handed. You hear the echo of a voice: Not everything that glitters is treasure. Outcome: You are sent back to the start. The gemstone was an illusion.");
            break;
                
            case 2:
                System.out.println("You follow the River of Whispers, the soft murmuring of voices growing louder with each step. The water sparkles in the moonlight, and as you kneel down to touch it, the voices become clear: they are warnings. The water is cursed, they say, but it's too late. Your reflection in the river begins to shift and change until you're staring at someone else—a version of you that has never ventured into the forest. Suddenly, you feel yourself being pulled into the river. The world spins, and when you open your eyes, you're standing at the edge of the forest once more. Outcome: You have been reset to the moment before you entered the forest, as if nothing happened. But the memory of the river’s warning lingers.");
            break;
            
            case 3:
                System.out.println("You choose the glowing Bridge of Light. Each step you take feels lighter, as if the bridge itself is lifting you. As you reach the other side, the forest opens up into a peaceful glade, bathed in golden light. At the center of the clearing is a chest made of shimmering gold. You approach, and the chest creaks open, revealing an ancient map. The map shows a hidden path deep within the forest, leading to a forgotten treasure. Congratulations! You have found the Map of Secrets—your journey has just begun. Outcome: You have uncovered a hidden path to greater treasure. The adventure continues!");
            break;
            
            case 4:
                System.out.println("Hidden behind a cluster of thick vines, you notice a dark cave entrance you hadn’t seen before. The whispers in the air seem to grow louder as you approach. Stepping into the cave, the air is damp, and the echoes of your footsteps fill the space, blending with the voices that seem to come from deep within. As you venture further, you see a glowing, ancient door etched with strange symbols. The whispers grow more insistent. Do you open the door? You hesitate but decide to push it open. Inside is a room filled with mirrors, each reflecting not only your face but different moments from your past. Some are happy, others filled with regret. As you step closer to a mirror, the whispers finally reveal themselves: they are your own thoughts, forgotten memories urging you to face your choices. Outcome: You are given a choice to confront your past. If you do, the mirrors shatter, leaving behind a single, brilliant light—a new path forward, free from doubt. If you refuse, you leave the cave unchanged, burdened by the same echoes as before.");
            break;
            
            default: 
                System.out.println("invalid Choice!");
        }
        
	}
}