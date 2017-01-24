package jp.ac.uryukyu.ie.e165726;


import java.io.*;
public class Part2 {
    public int question2(int ansNum)throws IOException
    {
        Answer2 as2 = new Answer2();
        String[] word = {"executable","quote","insert","static","bug"};

        String[] selection;
        selection = new String[5];

        selection[0] = "1.規制 2.引用する 3.実行可能な 4.動的";  //3
        selection[1] = "1.引用する 2.静的 3.虫 4.先頭に追加する";     //1
        selection[2] = "1.操作 2.挿入する 3.害虫を除く 4.実行可能な";       //2
        selection[3] = "1.虫 2.規制 3.静的 4.引用する";     //3
        selection[4] = "1.動的 2.引用する 3.虫 4.実行可能な";        //3

        for (int i = 0; i < 5; i++)
        {
            System.out.println(word[i]);
            System.out.println(selection[i]);
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String ans = br.readLine();
            System.out.println("あなたの答えは" + ans + "ですね。");
            ansNum = as2.answer2(i, ans, ansNum);
        }
        return ansNum;

    }
}
