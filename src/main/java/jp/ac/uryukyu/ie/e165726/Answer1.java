package jp.ac.uryukyu.ie.e165726;

public class Answer1 {

    public int answer1(int i, String ans, int ansNum){ // 選んだ答えが当たっているか答え合わせするメソッド。
        int q = Integer.parseInt(ans); // String型をint型に変換し、変数qに入れる。
        int CollectAnswer; //答えを入れる変数を用意。
        if (i == 0){ //問題1
            if(q == 3) {
                correct();
                ansNum += 1;
            }else{
                CollectAnswer = 3;
                mistake(CollectAnswer);
            }
        }else if(i == 1){ //問題2
            if(q == 1){
                correct();
                ansNum += 1;
            }else{
                CollectAnswer = 1;
                mistake(CollectAnswer);
            }
        }else if(i == 2){ //問題3
            if(q == 2){
                correct();
                ansNum += 1;
            }else{
                CollectAnswer = 2;
                mistake(CollectAnswer);
            }
        }else if(i == 3){ //問題4
            if(q == 2){
                correct();
                ansNum += 1;
            }else{
                CollectAnswer = 2;
                mistake(CollectAnswer);
            }
        }else{ //問題5
            if(q == 4){
                correct();
                ansNum += 1;
            }else{
                CollectAnswer = 4;
                mistake(CollectAnswer);
            }
        }
        return ansNum;
    }

    public void correct(){ //答えが当たっていたら正解！！と出力する
        System.out.println("正解！！");
    }

    public void mistake(int CollectAnswer){ //答えが間違えていたら正解番号を出力する
        System.out.println("残念。正解は" + CollectAnswer + "です。");
    }

}