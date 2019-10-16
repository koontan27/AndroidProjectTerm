package com.example.calcalculated


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.calcalculated.databinding.FragmentOverviewBinding

/**
 * A simple [Fragment] subclass.
 */
class overViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentOverviewBinding>(inflater,R.layout.fragment_overview,container,false)

        binding.goMainBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_overViewFragment_to_mainFragment)
        }
        return binding.root
    }


}
