package jp.ac.uryukyu.ie.e165726;

import java.io.*;

public class Part1 { //165719E 伊波卓浩担当

    public int question1(int ansNum)throws IOException
    {
        Answer1 as1 = new Answer1();

        for (int i = 0; i < 5; i++)  //iは配列番号
        {
            preparationWord(i);
            preparationSelection(i);
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String ans = br.readLine();  //入力した文字列をString型のansに代入する
            System.out.println("あなたの答えは" + ans + "ですね。");
            ansNum = as1.answer1(i, ans);
        }
        return ansNum;
    }

    public void preparationWord(int i){
        //String型で配列wordに5個の単語を用意
        String[] word = {"architecture","compilation","authentication","integrate","Administrator"};
        System.out.println(word[i]);
    }

    public void preparationSelection(int i){
        String[] selection;//String型で選択肢の配列を用意
        selection = new String[5];//選択肢のインスタンス5個を用意

        selection[0] = "1.コンパイル 2.統合する 3.設計 4.並列処理";  // Answer 3
        selection[1] = "1.コンパイル 2.周辺機器 3.促す 4.監査";     // Answer 1
        selection[2] = "1.静止した 2.認証 3.並列処理 4.監査";       // Answer 2
        selection[3] = "1.管理者 2.統合する 3.促す 4.周辺機器";     // Answer 2
        selection[4] = "1.設計 2.認証 3.静止した 4.管理者";        // Answer 4

        System.out.println(selection[i]);
    }
}