class NewsAgency : Subject {

    private var news: String? = null
    private val observers: ArrayList<Observer> = ArrayList()

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    private fun notifyObservers() {
        for (observer in observers) {
            observer.update(news.toString())
        }
    }

    fun updateNews(news: String?) {
        this.news = news
        notifyObservers()
    }
}
