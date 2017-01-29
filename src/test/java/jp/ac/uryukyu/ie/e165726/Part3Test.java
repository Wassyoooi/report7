package jp.ac.uryukyu.ie.e165726;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e165726 on 2017/01/29.
 */
public class Part3Test { //Part3クラスのユニットテスト
    @Test
    public void preparationSelection() throws Exception{ //preparationSelection()メソッドのユニットテスト
        Part3 part3 = new Part3(); //part3クラスのインスタンス生成
        for(int i=0;i<5;i++){ //1~5問目までの選択肢が出力されているか
            System.out.print((i+1)+"問目 ");
            part3.preparationSelection(i);
        }

    }

}