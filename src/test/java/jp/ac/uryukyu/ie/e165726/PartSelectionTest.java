package jp.ac.uryukyu.ie.e165726;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e165726 on 2017/01/28.
 */
public class PartSelectionTest { //PartSelectionクラスのテストコード　165726H 兼島光平担当
    @Test
    public void judge() throws Exception { //judgeメソッドのテストコード
        System.out.println("@Test judge call");
        PartSelection partSelection = new PartSelection(); //PartSelectionクラスのインスタンス生成

        //全問正解の時
        int ansNum = 5; //正解数5問
        boolean isAlreadyOutput = true; //全問正解メッセージを出力させないようにする(どちらでもよい)
        int correctJudge = 2; //全問正解なら2が代入される
        assertEquals(correctJudge,partSelection.judge(ansNum,isAlreadyOutput)); //全問正解の時、int型変数correctJudgeと同じ値である2が返り値となっているか

        //全問正解ではない時
        ansNum = 4; //正解数4問
        correctJudge = 1; //全問正解でないなら1が代入される
        assertEquals(correctJudge,partSelection.judge(ansNum,isAlreadyOutput)); //全問正解でない時、int型変数correctJudgeと同じ値である1が返り値となっているか

        //問題解くのをやめる時
        ansNum = 256; //5より大きく適当な値256を代入
        correctJudge = 3; //やめる場合は3が代入される
        assertEquals(correctJudge,partSelection.judge(ansNum,isAlreadyOutput)); //やめる時、int型変数correctJudgeと同じ値である3が返り値となっているか
    }

}