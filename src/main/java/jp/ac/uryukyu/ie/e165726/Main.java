package jp.ac.uryukyu.ie.e165726;

import java.io.*;

public class Main {  //165726H 兼島光平担当

    public static void main(String[] args)throws IOException{
        PartSelection partSelection = new PartSelection();
        int partNum;     //選択パート番号
        int ansNum;      //正解数
        boolean isAlreadyOutput = true; //全問正解メッセージを出力したか判定

        System.out.println("単語の達人");
        System.out.println();
        System.out.println("このプログラムはIT系によく出てくる英単語を覚えるために作られました。各パート5単語ずつ出題されるので、4択の中から正解を選んでください。すべて正解するまで抜けられません。");
        System.out.println();

        do {
            partNum = partSelection.select();   //パート選択
            do {
                ansNum = partSelection.callPart(partNum);   //パート実行し、正解数を求める
                if(ansNum == 5) isAlreadyOutput = false;    //全問正解メッセージを出力させるようにする
            } while (partSelection.judge(ansNum,isAlreadyOutput) == 1);     //全問正解じゃなければ最初の単語からやり直し
            isAlreadyOutput = true;                         //全問正解メッセージを出力させないようにする
        }while(partSelection.judge(ansNum,isAlreadyOutput) == 2);   //コンテニューするか確認
    }
}
