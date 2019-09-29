package iteso.mx.tarea05.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import iteso.mx.tarea05.R
import iteso.mx.tarea05.activities.ActivityTutorial

class TutorialSecondFragment : Fragment() {
    private lateinit var nextBtn: Button
    private lateinit var prevBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tutorial_second_fragment, container, false)
        nextBtn = view.findViewById(R.id.activity_tutorial_secondfrag_next)
        prevBtn = view.findViewById(R.id.activity_tutorial_secondfrag_previous)
        nextBtn.setOnClickListener {
            (activity as ActivityTutorial).onNext(2)
        }
        prevBtn.setOnClickListener {
            (activity as ActivityTutorial).onPrevious(2)
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

}