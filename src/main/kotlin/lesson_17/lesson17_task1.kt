package lesson_17

class Quiz(private var _question: String, private var _answer: String) {

    val question: String
        get() = _question

    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}
