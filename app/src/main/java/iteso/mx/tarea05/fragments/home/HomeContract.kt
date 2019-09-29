package iteso.mx.tarea05.fragments.home

interface HomeContract {
    interface homeView {
        fun showRefreshView()
        fun showProgress()
        fun showNoInfo()
        fun showInfo()
    }

    interface homePresenter {
        fun fetchData()
    }
}