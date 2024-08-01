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

    
    //勝率の計算メソッド　勝ち数/(勝ち数+負け数)と戻り値
    public double getRate() {
        double rate = (double)this.win / (this.win + this.lose);
        return rate;
    }

    //成績の出力メソッド
    public void report() {
        System.out.println(this.name +"の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、" + "勝率は"+ getRate() + "です。");
    }
}