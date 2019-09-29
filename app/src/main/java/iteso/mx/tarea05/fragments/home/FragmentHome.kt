package iteso.mx.tarea05.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ViewAnimator
import androidx.fragment.app.Fragment
import iteso.mx.tarea05.R

class FragmentHome : Fragment(), HomeContract.homeView{
    private lateinit var mSwitcher: ViewAnimator
    private lateinit var mPresenter: HomeContract.homePresenter
    private lateinit var refreshButton : Button
    companion object {
        const val SHOW_REFRESHVIEW = 0
        const val SHOW_PROGRESS = 1
        const val SHOW_NOINFO = 2
        const val SHOW_INFO = 3
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmenthome, container, false)
        refreshButton = view.findViewById(R.id.fragmenthome_refreshbutton)
        mSwitcher = view.findViewById(R.id.activity_main_va_switcher)
        mPresenter = HomePresenter(this)

        refreshButton.setOnClickListener {
            showRefreshView()
        }
        return view
    }

    override fun showRefreshView() {
        mSwitcher.displayedChild = SHOW_REFRESHVIEW
        mPresenter.fetchData()
    }

    override fun showProgress() {
        mSwitcher.displayedChild = SHOW_PROGRESS
    }

    override fun showNoInfo() {
        mSwitcher.displayedChild = SHOW_NOINFO
    }

    override fun showInfo() {
        mSwitcher.displayedChild = SHOW_INFO
    }

}