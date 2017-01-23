package jp.ac.uryukyu.ie.e165726;

import java.io.*;

public class PartSelection {
    public int select() throws IOException {    //ユーザーにpartを入力させる
        try{
            //Part2Class part2 = new Part2Class();
            //Part3Class part3 = new Part3Class();
            System.out.println("パートを選ぶドン!");
            System.out.println("part1,part2,part3,おわる");
            System.out.println();
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            System.out.println("part1を選ぶなら「1」、part2を選ぶなら「2」、part3を選ぶなら「3」を入力してください。おわる時はそれ以外のキーを入力してください。");
            String part = br.readLine();    //パート番号入力
            int p = Integer.parseInt(part);
            if(p>0 && p<=3) System.out.println("さあ、はじまるドン!!");
            return p;
        }catch (NumberFormatException e){ //数値以外のキーが入力された場合
            int p = 256;
            return p;
        }
    }

    public int callPart(int part) throws IOException {   //選択したパートを呼び出す
        int ansNum = 0; //正解数
        if (part == 1) {            //パート1を選択
            Part1 part1 = new Part1();
            ansNum = part1.question1(ansNum);
            System.out.println("正解数は5問中" + ansNum + "問です。");
        } else if (part == 2) {     //パート2を選択
            //ansNum = Part2. "メソッド"
            //System.out.println("正解数は5問中%d問です。", ansnum);
        } else if (part == 3) {     //パート3を選択
            //ansNum = Part3. "メソッド"
            //System.out.println("正解数は5問中%d問です。", ansnum);
        } else {                    //問題をやめる
            System.out.println("また遊んでネ!");
            ansNum = 256;
        }
        return ansNum;
    }

    public int judge(int ansNum,boolean AlreadyOutput) { //全問正解かどうか判断
        int correctJudge;       //全問正解ではないのなら1,全問正解なら2,問題をやめる場合3が代入される
        if (ansNum < 5) {       //全問正解ではない
            System.out.println("全問正解じゃないドン!");
            System.out.println("もう一回遊べるドン!");
            correctJudge = 1;
        }else if(ansNum == 5){  //全問正解
            if(AlreadyOutput == false){
                System.out.println("全問正解!!おめでとう!!");
            }
            correctJudge = 2;
        }else{                  //問題をやめる
            correctJudge = 3;
        }
        return correctJudge;
    }

}