import java.util.*;

public class isWinner2660 {
    public static void main(String[] args) {

    }
        public int isWinner(int[] player1, int[] player2) {
            int n = player1.length;
            int score1 = 0;
            int score2 = 0;
            for (int i = 0; i < n; i++) {
                score1 += findScore(player1, i);
                score2 += findScore(player2, i);
            }

            if (score1 == score2) {
                return 0;
            }

            return score1 > score2 ? 1 : 2;
        }

        public int findScore(int[] player, int i) {
            if ((i > 0 && player[i-1] == 10) || (i > 1 && player[i-2] == 10)) {
                return 2 * player[i];
            } else {
                return player[i];
            }
        }
    }


