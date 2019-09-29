package iteso.mx.tarea05.fragments.home

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.util.*

class HomePresenter(private val view: HomeContract.homeView) : HomeContract.homePresenter {
    override fun fetchData() {
        view.showProgress()
        doAsync {
            Thread.sleep(4000)
            val random = Random()
            val randomInt = random.nextInt(20)
            if (randomInt < 11) {
                uiThread {
                    view.showNoInfo()
                }
            } else {
                uiThread {
                    view.showInfo()
                }
            }
        }
    }
}