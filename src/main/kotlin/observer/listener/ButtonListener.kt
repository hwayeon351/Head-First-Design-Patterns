package observer.listener

//Listener 클래스
class ButtonListener : Button.OnClickListener {
    //listener.onClick()가 호출되면 실행
    override fun onclick() {
        println("Override Method Call")
    }
}
