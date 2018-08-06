/**
 * 자바와 다르게 프로퍼티를 구성하는 간단하다.
 * 사람의 정보를 저장하는 Person클래스를 자바로 작성했을 경우
 * public class Persion{
 *  private String name = "";
 *
 *  public String getName(){
 *      return name;
 *  }
 *  public String setName(String name){
 *      this.name = name;
 *      }
 *   }
 *
 *   이렇게 Getter/Setter 메서드를 추가해야 하므로 코드가 불필요하게 늘어남.
 *   하지만 Kotlin에서는 아래와 같이 작성한다.
 *
 *   val는 변할 수 없는 값이며 Getter메서드만 있다는 의미
 *
 *   프로퍼티 선언 시점이나 생성자 호출 시점에 값을 할당할 수 없는 경우에는
 *   lateinit키워드를 사용하여 이 프로퍼티의 값이 나중에 할당될 것임을 명시한다.
 */
class Person{
    var name : String? = null // 물음표는 null값이 들어갈 수 있음을 의미
    val address : String? = null
    lateinit var age : String // 선언 시점에 값을 할당하지 않아도 컴파일 에러가 발생하지 않음.

    var number : String = "01011112222" // 타입 추론이 가능하면 타입 생략
    var phone : String? =null // null 만으로는 타입을 추론할 수 없기에 타입 선언이 필요하다.
}

fun main(args: Array<String>) {

}
