/**
 *
 */
class Person(val name: String, var age: Int){
    //접근 제한자가 없으면 pulbic으로 간주합니다.
    val a = 1
    protected val b = 2

    private val c = 3


    //internal 접근 제한자는 동일한 모듈 내에 있는 클래스들로의 접근을 제한합니다.
    //따라서 외부 모듈에서는 이 접근 제한자로 선언된 요소에 접근할 수 없습니다.
    internal val d = 4

    init {
        // 주 생성자
        //생성자에서 인자가 필요한 경우 class에 인자로 받은 것을 사용한다.
        //추가로 프로퍼티를 선언하지 않아도된다.
        println("Name : $name Age : $age")
    }

    //a의 값만 인자로 받는 추가 생성자
    //기본 생성자를 반드시 호출해야한다.
    constructor(a: Int) : this("KIM",32)


    constructor() : this("",0)
}

class Animal internal constructor(val a: Int, var b:Char){
    //추가 생성자의 가시성 지정
    private constructor(a: Int) : this(1,'C')

    //접근 제한자를 지정하지 않았으므로 public
    constructor(): this(0,'A')


}

fun main(args: Array<String>) {

}
