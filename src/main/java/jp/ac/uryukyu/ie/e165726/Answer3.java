package jp.ac.uryukyu.ie.e165726;

/**
 * Created by e165744 on 2017/01/23.
 */
public class Answer3 {
    public int answer3(int i, String ans, int ansnum){
        int q = Integer.parseInt(ans);
        if (i == 0){
            if(q == 2) {
                System.out.println("正解！！");
                ansnum += 1;
            }else{
                System.out.println("残念。正解は2です。");
            }
        }else if(i == 1){
            if(q == 4){
                System.out.println("正解！！");
                ansnum += 1;
            }else{
                System.out.println("残念。正解は4です。");
            }
        }else if(i == 2){
            if(q == 3){
                System.out.println("正解！！");
                ansnum += 1;
            }else{
                System.out.println("残念。正解は3です。");
            }
        }else if(i == 3){
            if(q == 2){
                System.out.println("正解！！");
                ansnum += 1;
            }else{
                System.out.println("残念。正解は2です。");
            }
        }else{
            if(q == 1){
                System.out.println("正解！！");
                ansnum += 1;
            }else{
                System.out.println("残念。正解は1です。");
            }
        }
        return ansnum;
    }
}
