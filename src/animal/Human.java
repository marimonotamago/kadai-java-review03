package animal;

public class Human extends Animal implements Thinkable {
//Thinkableインターフェイスの実装

//趣味に関するフィールド　変数名は自由でカプセル化
    private String hoby;//趣味


    //引数なしのコンストラクタ
    public Human(String hoby) {
            }

    //引数ありのコンストラクタ
    //名前・年齢・趣味の情報を格納する引数を設定し
    //処理内容として名前・年齢・趣味の各変数を引数の情報で初期化する
    public Human(String name, int age, String hoby) {
        super(name, age);//スーパークラスのコンストラクタの呼び出し
        this.hoby = hoby;//趣味を追加
        }

    //thinkメソッドを実装
    public void think() {
    System.out.println("私は" + hoby + "について考えています。");
}

    //getter
    public String getHoby() {
        return hoby;
    }

    //setter
    public void setHoby(String hoby) {
        this.hoby = hoby;
    }
}
