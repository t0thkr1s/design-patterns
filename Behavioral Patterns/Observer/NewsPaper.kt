class NewsPaper internal constructor(private val title: String) : Observer {

    override fun update(information: String) {
        println("$title -> $information")
    }

    fun register(subject: Subject) {
        subject.registerObserver(this)
    }
}
