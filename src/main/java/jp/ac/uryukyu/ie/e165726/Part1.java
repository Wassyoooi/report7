package jp.ac.uryukyu.ie.e165726;

import java.io.*;
/**
 * Created by e165719 on 2017/01/17.
 */
public class Part1 {

    public void question1()throws IOException
    {
        Answer as = new Answer();
        String[] word = {"architecture","compilation","authentication","integrate","Administrator"};

        String[] selection;
        selection = new String[5];

        selection[0] = "1.コンパイル 2.統合する 3.設計 4.並列処理";  //3
        selection[1] = "1.コンパイル 2.周辺機器 3.促す 4.監査";     //1
        selection[2] = "1.静止した 2.認証 3.並列処理 4.監査";       //2
        selection[3] = "1.管理者 2.統合する 3.促す 4.周辺機器";     //2
        selection[4] = "1.設計 2.認証 3.静止した 4.管理者";        //4

        for (int i = 0; i < 5; i++)
        {
            System.out.println(word[i]);
            System.out.println(selection[i]);
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String ans = br.readLine();
            System.out.println("あなたの答えは" + ans + "ですね。");
            as.answer(i, ans);
        }
    }
}
