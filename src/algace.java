import javax.swing.tree.DefaultMutableTreeNode;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

//pridame do gitu trápny kódik

public class algace {
    public static void main(String[] args) {
        char pismenko = 'A';
        char pismenko2 = 'E';
        for (int i = 0; i < ('E' - 'A' + 1 ); i++){
            for (int j = 0; j <= i ; j++){
                System.out.print(pismenko + " ");
            }
            pismenko++;
            System.out.println();
        }

        for (int i = 4; i > ('A' - 'E' + 3); --i){
            for (int j = 0; j<= i ; j++) {
                System.out.print(pismenko2 + " ");
            }
            pismenko2--;
            System.out.println();
        }
    }
}





