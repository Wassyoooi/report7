package jp.ac.uryukyu.ie.e165726;

public class Answer1 {
    public int answer1(int i, String ans, int ansnum){ // 選んだ答えが当たっているか答え合わせする。
        int q = Integer.parseInt(ans); // String型をint型に変換し、変数qに入れる。
        if (i == 0){ //問題1
            if(q == 3) {
                System.out.println("正解！！");
                ansnum += 1;
            }else{
                System.out.println("残念。正解は3です。");
            }
        }else if(i == 1){ //問題2
            if(q == 1){
                System.out.println("正解！！");
                ansnum += 1;
            }else{
                System.out.println("残念。正解は1です。");
            }
        }else if(i == 2){ //問題3
            if(q == 2){
                System.out.println("正解！！");
                ansnum += 1;
            }else{
                System.out.println("残念。正解は2です。");
            }
        }else if(i == 3){ //問題4
            if(q == 2){
                System.out.println("正解！！");
                ansnum += 1;
            }else{
                System.out.println("残念。正解は2です。");
            }
        }else{ //問題5
            if(q == 4){
                System.out.println("正解！！");
                ansnum += 1;
            }else{
                System.out.println("残念。正解は4です。");
            }
        }
        return ansnum;
    }
}