package baseball;

public class BaseBallTeam {
    //フィールドのカプセル化
    private String name;//球団名
    private int win;//勝利
    private int lose;//敗北
    private int draw;//引き分け

    //引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //勝率の計算メソッド　勝ち数/(勝ち数+負け数)
    public double getRate(int win, int lose) {
        double rate = this.win / (this.win + this.lose);
        return rate;
    }

    //成績の出力メソッド
    public double report(this.name, this.win, this.lose, this.draw, double rate) {
        System.out.println(this.name +"の2022年の成績は" + win + "勝" + lose + "敗" + draw + "勝率は0."+ rate + "です。");
    }


 }
