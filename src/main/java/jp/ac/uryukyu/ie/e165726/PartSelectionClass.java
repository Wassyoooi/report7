package jp.ac.uryukyu.ie.e165726;

import java.io.*;

public class PartSelection {
    private int part;

    public static void PartSelection()throws IOException {
        System.out.println("パートを選ぶドン!");
        System.out.println("part1,part2,part3");
        System.out.println();
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("part1を選ぶなら「1」、part2を選ぶなら「2」、part3を選ぶなら「3」を入力してください。");
        String part = br.readLine();
        System.out.println("さあ、はじまるドン!!");

        if(part == "1"){
            ansnum = Part1Class."メソッド"
        }else if(part == "2"){

        }else if(part == "3"){

        }else{
            System.out.println("入力し直してください");
        }
    }
}