object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val newsAgency = NewsAgency()
        val wsj = NewsPaper("Wall Street Journal")
        wsj.register(newsAgency)
        newsAgency.updateNews("Facebook is scanning your private messages")
        newsAgency.updateNews("Crypto exchange site hacked")
        val ut = NewsPaper("USA Today")
        ut.register(newsAgency)
        newsAgency.updateNews("Another attack carried out by ISIS")
        newsAgency.removeObserver(wsj)
        newsAgency.removeObserver(ut)
    }
}
