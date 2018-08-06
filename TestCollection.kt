

fun main(args: Array<String>) {
    /**
     * Kotlin Collection은 변경 불가와 변경 가능 두 종류로 구분된다.
     *
     * 변경 불가 : List, Map, Set
     * 변경 가능 : MutableList, MutableMap, MutableSet
     */

    val immutableList : List<String> = listOf("A", "B", "C")

    // 아래와 같이 add메서드를 사용하지 못함
    //immutableList.add("D")
    // 아래와 같이 변경불가
    //immutableList[0] = "AA"

    //위와 다르게 add함수를 쓸 수 있다.
    val mutableList : MutableList<String> = arrayListOf("A", "B", "C")
    mutableList.add("D")
    //위와 다르게 리스트 중 어느 한 값으 변경 할 수 있다.
    mutableList[0] = "AA"

    val immutableMap : Map<String, Int> = mapOf("A" to 1, "B" to 2)
    //아래와 같이 값 변경 불가
    //immutableList["C"] = 3

    val mutableMap : HashMap<String, Int> = hashMapOf("A" to 1, "B" to 2)
    mutableMap["C"] = 3

}
