package com.example.calcalculated


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.calcalculated.databinding.FragmentFoodBinding

/**
 * A simple [Fragment] subclass.
 */
class foodFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFoodBinding>(inflater,R.layout.fragment_food,container,false)
        return binding.root
    }


}
