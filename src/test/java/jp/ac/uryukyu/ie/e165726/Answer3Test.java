package jp.ac.uryukyu.ie.e165726;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e165726 on 2017/01/28.
 */
public class Answer3Test { //Answer3クラスのテストコード
    @Test
    public void answer1() throws Exception { //answer3メソッドのテストコード
        Answer3 as3 = new Answer3(); //Answer1クラスのインスタンスの呼び出し
        int ansNum = 0; //正解数を0に設定
        int i = 0; //問題番号を0に設定

        //正解が入力された時
        String ans = "2"; //問題番号0に対する正解番号2を設定
        ansNum++; //正解数を+1する
        assertEquals(ansNum,as3.answer3(i,ans)); //問題を正解した時、正解数を+1した値1が返り値となっているか

        //間違いが入力された時
        ans = "3"; //問題番号0に対する誤答番号3を設定
        assertEquals(ansNum,as3.answer3(i,ans)); //問題を間違えた時、正解数をカウントしないのでそのままの値1が返り値となっているか
    }

}