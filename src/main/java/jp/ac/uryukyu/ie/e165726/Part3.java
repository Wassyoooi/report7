package jp.ac.uryukyu.ie.e165726;

import java.io.*;
public class Part3 {
    public int question3(int ansNum)throws IOException
    {
        Answer3 as3 = new Answer3();
        String[] word = {"drawback","encryption","abstraction","decision","identifier"};

        String[] selection;
        selection = new String[5];

        selection[0] = "1.四捨五入する 2.欠点 3.抽象 4.決定"; //2
        selection[1] = "1.繰り下げる 2.欠点 3.抽象 4.暗号化"; //4
        selection[2] = "1.映像 2.繰り下げる 3.抽象 4.暗号化"; //3
        selection[3] = "1.暗号化 2.決定 3.映像 4.ID"; //2
        selection[4] = "1.ID 2.欠点 3.責任 4.能力がない"; //1

        for (int i = 0; i < 5; i++)
        {
            System.out.println(word[i]);
            System.out.println(selection[i]);
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String ans = br.readLine();
            System.out.println("あなたの答えは" + ans + "ですね。");
            ansNum = as3.answer3(i, ans, ansNum);
        }
        return ansNum;

    }
}
