//Codewars Leaderboard Climber

package com.codewars.apartridge;

public class CodewarsLeaderboardClimber {
    public static String leaderBoard(String user, int userScore, int yourScore) {
    int kyukata = 0;
    int BETA = 0;
    int sum = 0;
    int diff;
    if (yourScore > userScore){
        return "Winning!";
        }
        else if(yourScore == userScore){
        return "Only need one!";
        }
        else {
        diff = (userScore - yourScore);
        kyukata = diff % 3;
        BETA = diff/3;
        sum = kyukata + BETA;
        }
        if(sum > 1000)
        return "To beat "+ user + "'s score, I must complete " + BETA +" Beta kata and "+ kyukata +" 8kyu kata. Dammit!";
        else        
        return "To beat "+ user + "'s score, I must complete " + BETA +" Beta kata and "+ kyukata +" 8kyu kata." ;   
    }
}
