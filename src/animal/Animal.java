package animal;

public class Animal {
    //Humanクラスの親(スーパークラス)
    //フィールド作成
    //カプセル化
  private String name;//名前
  private int age;    //年齢

//引数なしコンストラクタ
  public Animal() {
  }

  //引数ありコンストラクタ
  //コンストラクタに名前・年齢の情報を格納する引数を設定。
  //処理内容として名前・年齢の各フィールドを引数の情報で初期化
  public Animal(String name, int age) {
      this.name = name;
      this.age = age;
  }

  //say という名前のpublicなメソッド
  //フィールドに代入された名前と年齢を使って 「○○です。△△歳です。」と表示する処理
  public void say() {
      System.out.println(this.name + "です。" + this.age + "歳です。");
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }
}
