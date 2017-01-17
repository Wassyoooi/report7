package jp.ac.uryukyu.ie.e165726;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        int ansnum = 0;
        System.out.println("苦しんで覚える英単語、単語の達人");
        System.out.println();
        System.out.println("このプログラムはIT系によく出てくる英単語を覚えるために作られました。各パート10単語ずつ出題されるので、4択の中から正解を選んでください。すべて正解するまで抜けられません。");
        System.out.println();
        System.out.println("パートを選ぶドン!");
        System.out.println("part1,part2,part3");
        System.out.println();
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("part1を選ぶなら「1」、part2を選ぶなら「2」、part3を選ぶなら「3」を入力してください。");
        String part = br.readLine();
        System.out.println("さあ、はじまるドン!!");
        while(ansnum != 10){    //全問正解じゃなければ終わらない
            PartSelection partSelection = new PartSelection(part);
            ansnum = partSelection.select();
            if(ansnum != 10) System.out.println("もう一回遊べるドン!");
            else System.out.println("全問正解!!おめでとう!!");
        }
        System.out.println("コンティニューする?");
        System.out.println("yes:no");
        String conti = br.readLine();
        if(conti == "yes"){

        }else{
            System.out.println("ありがとう！また遊んでネ!");
        }


    }
}
