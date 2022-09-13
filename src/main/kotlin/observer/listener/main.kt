package observer.listener

fun main() {
    val button = Button()
    button.addListener(ButtonListener())


    val button1 = Button()
    //익명 객체를 활용해 Listener 구현
    button1.addListener(object : Button.OnClickListener {
        override fun onclick() {
            println("onClicked!!")
        }
    })

    try {
        Thread.sleep(2000)
        println("button")
        button.OnClick()
        println("\nbutton1")
        button1.OnClick()
    } catch (e : InterruptedException) {
        e.printStackTrace()
    }

}