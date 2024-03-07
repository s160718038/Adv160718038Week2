package com.example.adv160718038week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.adv160718038week2.databinding.ActivityMainBinding
import com.example.adv160718038week2.databinding.FragmentGameBinding


class GameFragment : Fragment() {
    private lateinit var binding:FragmentGameBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnbck.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToGameFragment()
            Navigation.findNavController(it).navigate(action)
        }

    }



}
