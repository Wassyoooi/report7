package jp.ac.uryukyu.ie.e165726;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e165726 on 2017/01/29.
 */
public class Part2Test { //Part2クラスのユニットテスト
    @Test
    public void preparationSelection() throws Exception{ //preparationSelection()メソッドのユニットテスト
        Part2 part2 = new Part2(); //part2クラスのインスタンス生成
        for(int i=0;i<5;i++){ //1~5問目までの選択肢が出力されているか
            System.out.print((i+1)+"問目 ");
            part2.preparationSelection(i);
        }

    }

}