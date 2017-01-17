package jp.ac.uryukyu.ie.e165726;

import java.io.*;

public class PartSelection {
    String part;

    public PartSelection(String part)throws IOException {
        this.part = part;
    }

    public int select()throws IOException{   //PartClassから正解数を受け取る
        int ansnum = 0;
        Part1Class part1 = new Part1Class();
        Part2Class part2 = new Part2Class();
        Part3Class part3 = new Part3Class();
        if(part == "1"){
            ansnum = Part1Class."メソッド"
        }else if(part == "2"){
            ansnum = Part2Class."メソッド"
        }else if(part == "3"){
            ansnum = Part3Class."メソッド"
        }else{
            System.out.println("入力し直してください");
        }
        System.out.println("正解数は10問中%d問です。",ansnum);
        return ansnum;
    }
}