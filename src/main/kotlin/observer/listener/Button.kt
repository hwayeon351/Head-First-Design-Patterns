package observer.listener

//Subject 클래스
class Button {
    //이벤트를 전달해주는 인터페이스
    private var listener: OnClickListener? = null

    interface OnClickListener {
        //콜백 메서드(추상 메서드)
        fun onclick()
    }

    //Listener 등록 메서드
    fun addListener(listener: OnClickListener?) {
        this.listener = listener
    }

    fun OnClick() {
        //Listener가 등록된 경우에만 실행
        if (listener != null) {
            println("CallBack Method Call")
            //콜백 메서드 호출
            listener!!.onclick()
        }
    }
}