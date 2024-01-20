import java.util.Arrays;
import java.util.Random;

public class Lottery {

    public static void main(String[] args) {

        Random random = new Random();

        int[] winCombo = new int[7];
        int[] userCombo = new int[7];
        int matches = 0;

        for (int i = 0; i < winCombo.length; i++) {
            winCombo[i] = random.nextInt(10);
        }

        Arrays.sort(winCombo);
        System.out.println(Arrays.toString(winCombo));

        for (int i = 0; i < userCombo.length; i++) {
            userCombo[i] = random.nextInt(10);
        }

        Arrays.sort(userCombo);
        System.out.println(Arrays.toString(userCombo));

        for(int index=0;index< winCombo.length;index++){
            if(winCombo[index]==userCombo[index]){
                ++matches;
            }
        }
        System.out.println("Кількість збігів: " + matches);
    }


}
