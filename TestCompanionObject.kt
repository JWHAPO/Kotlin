/**
 ***********동반객체 *****************
 *코틀린은 클래스 내에 정적 필드나 정적 함수를 둘 수 없다.
 * 대신에 클래스별로 하나씩 클래스의 인스턴스 생성없이 사용할 수 있는 오브젝트(object)를 정의할 수 있는데,
 * 이를 동반객체(companion object)라 한다.
 */

class User private constructor(val name: String, val registerTime: Long){
    companion object {
        // companion object는 클래스 내부에 존재하브로
        //private로 선언된 생성자에 접근할 수 있습니다.
        fun create(name: String) : User{
            return User(name, System.currentTimeMillis())
        }
    }
    
}
