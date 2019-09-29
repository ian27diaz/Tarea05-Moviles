package iteso.mx.tarea05.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import iteso.mx.tarea05.R
import iteso.mx.tarea05.activities.ActivityTutorial

class TutorialThirdFragment : Fragment() {
    private lateinit var nextBtn: Button
    private lateinit var prevBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tutorial_third_fragment, container, false)
        nextBtn = view.findViewById(R.id.activity_tutorial_thirdfrag_finish)
        prevBtn = view.findViewById(R.id.activity_tutorial_thirdfrag_previous)
        nextBtn.setOnClickListener {
            (activity as ActivityTutorial).onNext(3)
        }
        prevBtn.setOnClickListener {
            (activity as ActivityTutorial).onPrevious(3)
        }
        return view
    }
}