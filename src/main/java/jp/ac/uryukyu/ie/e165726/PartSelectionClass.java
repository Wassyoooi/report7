package jp.ac.uryukyu.ie.e165726;

import java.io.*;

public class PartSelection {
    public int select() throws IOException {   //ユーザーにpartを入力させる
        Part1Class part1 = new Part1Class();
        Part2Class part2 = new Part2Class();
        Part3Class part3 = new Part3Class();
        System.out.println("パートを選ぶドン!");
        System.out.println("part1,part2,part3,おわる");
        System.out.println();
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("part1を選ぶなら「1」、part2を選ぶなら「2」、part3を選ぶなら「3」を入力してください。おわる時はそれ以外のキーを入力してください。");
        String part = br.readLine();
        System.out.println("さあ、はじまるドン!!");
        int p = Integer.parseInt(part);
        return p;
    }

    public int callPart(int part) {   //選択したパートを呼び出す
        int ansnum = 0;
        if (part == 1) {
            ansnum = Part1Class. "メソッド"
            System.out.println("正解数は10問中%d問です。", ansnum);
        } else if (part == 2) {
            ansnum = Part2Class. "メソッド"
            System.out.println("正解数は10問中%d問です。", ansnum);
        } else if (part == 3) {
            ansnum = Part3Class. "メソッド"
            System.out.println("正解数は10問中%d問です。", ansnum);
        } else {
            System.out.println("また遊んでネ!");
            ansnum = 256;
        }
        return ansnum;
    }

    public int judge(int ansnum) { //全問正解かどうか判断
        int allcorrect;
        if (ansnum < 10) {
            System.out.println("もう一回遊べるドン!");
            allcorrect = 1;
        }else if(ansnum == 10){
            System.out.println("全問正解!!おめでとう!!");
            allcorrect = 2;
        }else{
            allcorrect = 3;
        }
        return allcorrect;
    }

}
