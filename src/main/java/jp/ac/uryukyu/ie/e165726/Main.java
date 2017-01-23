package jp.ac.uryukyu.ie.e165726;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        PartSelectionClass partSelection = new PartSelectionClass();
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int partnum;     //選択パート番号
        int ansnum = 0;     //正解数
        boolean AlreadyOutput = true; //全問正解メッセージを出力したか判定

        System.out.println("苦しんで覚える英単語、単語の達人");
        System.out.println();
        System.out.println("このプログラムはIT系によく出てくる英単語を覚えるために作られました。各パート10単語ずつ出題されるので、4択の中から正解を選んでください。すべて正解するまで抜けられません。");
        System.out.println();

        do {
            partnum = partSelection.select();
            do {
                ansnum = partSelection.callPart(partnum);
                if(ansnum == 5) AlreadyOutput = false;
            } while (partSelection.judge(ansnum,AlreadyOutput) == 1);
            AlreadyOutput = true;
        }while(partSelection.judge(ansnum,AlreadyOutput) == 2);
    }
}
