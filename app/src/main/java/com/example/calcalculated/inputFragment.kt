package com.example.calcalculated


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.calcalculated.databinding.FragmentInputBinding

/**
 * A simple [Fragment] subclass.
 */
class inputFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentInputBinding>(inflater,R.layout.fragment_input,container,false)

        binding.saveBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_inputFragment_to_overViewFragment)
        }
        return binding.root
    }


}
