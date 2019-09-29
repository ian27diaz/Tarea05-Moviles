package iteso.mx.tarea05.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import iteso.mx.tarea05.R
import iteso.mx.tarea05.adapters.IOnClick
import android.content.Context
import iteso.mx.tarea05.activities.ActivityTutorial
import java.lang.ClassCastException


class TutorialFirstFragment : Fragment(){

    private lateinit var listener : IOnClick
    private lateinit var nextBtn: Button
    override fun onAttach(context: Context) {
        super.onAttach(context)
        try{
            listener = context as IOnClick
        } catch ( e: ClassCastException){
            error{e}
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tutorial_first_fragment, container, false)
        nextBtn = view.findViewById(R.id.activity_tutorial_firstfrag_next)
        nextBtn.setOnClickListener {
            (activity as ActivityTutorial).onNext(1)
        }
        return view
    }


}