package jp.ac.uryukyu.ie.e165726;


import java.io.*;
public class Part2 {
    public int question2(int ansNum)throws IOException
    {
        Answer2 as2 = new Answer2();
        String[] word = {"executable","quote","insert","static","bug"};//String型で配列wordに5個の単語を用意

        String[] selection;//String型で選択肢の配列を用意
        selection = new String[5];//選択肢のインスタンス5個を用意

        selection[0] = "1.規制 2.引用する 3.実行可能な 4.動的";  //答え3
        selection[1] = "1.引用する 2.静的 3.虫 4.先頭に追加する";     //答え1
        selection[2] = "1.操作 2.挿入する 3.害虫を除く 4.実行可能な";       //答え2
        selection[3] = "1.虫 2.規制 3.静的 4.引用する";     //答え3
        selection[4] = "1.動的 2.引用する 3.虫 4.実行可能な";        //答え3

        for (int i = 0; i < 5; i++)  //iは配列番号
        {
            System.out.println(word[i]);
            System.out.println(selection[i]);
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String ans = br.readLine();  //入力した文字列をString型のansに代入する
            System.out.println("あなたの答えは" + ans + "ですね。");
            ansNum = as2.answer2(i, ans, ansNum);
        }
        return ansNum;
    }
}
