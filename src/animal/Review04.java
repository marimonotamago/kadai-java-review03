package animal;

public class Review04 {

    public static void main(String[] args) {
        //Humanクラスのインスタンスを3つ作成
        //名前、年齢、趣味の各情報は、コンストラクタで初期化
        Human tanaka = new Human ("田中　太郎", 25, "電車");//初期値設定
        Human suzuki = new Human("鈴木　次郎", 30, "野球");
        Human sato = new Human("佐藤　花子", 20, "映画");

        //tanaka.sayとthinkメソッド
        tanaka.say();
        tanaka.think();

        //suzuki.sayとthinkメソッド
        suzuki.say();
        suzuki.think();

        //sato.sayとthinkメソッド
        sato.say();
        sato.think();


    }

}
