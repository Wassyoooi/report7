package jp.ac.uryukyu.ie.e165726;

import java.io.*;
public class Part3 {
    public int question3(int ansNum)throws IOException
    {
        Answer3 as3 = new Answer3();
        String[] word = {"drawback","encryption","abstraction","decision","identififer"};  //String型で配列wordに5個の単語を用意

        String[] selection;  //String型で選択肢の配列を用意
        selection = new String[5];  //選択肢のインスタンスを5個用意

        selection[0] = "1.四捨五入する 2.欠点 3.抽象 4.決定";       //答え2
        selection[1] = "1.繰り下げる 2.欠点 3.抽象 4.暗号化";        //答え4
        selection[2] = "1.映像 2.繰り下げる 3.抽象 4.暗号化";  //答え3
        selection[3] = "1.暗号化 2.決定 3.映像 4.ID";     //答え2
        selection[4] = "1.ID 2.欠点 3.責任 4.能力がない";     //答え1

        for (int i = 0; i < 5; i++)
        {
            System.out.println(word[i]);
            System.out.println(selection[i]);
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String ans = br.readLine();  //入力した文字列をString型のansに代入する
            System.out.println("あなたの答えは" + ans + "ですね。");
            ansNum = as3.answer3(i, ans, ansNum);
        }
        return ansNum;

    }
}
