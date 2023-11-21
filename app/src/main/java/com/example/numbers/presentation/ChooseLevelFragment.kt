package com.example.numbers.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.numbers.R
import com.example.numbers.databinding.FragmentChooseLevelBinding
import com.example.numbers.domain.entities.Level

class ChooseLevelFragment : Fragment() {

    private var _binding: FragmentChooseLevelBinding? = null
    private val binding: FragmentChooseLevelBinding
        get() = _binding ?: throw RuntimeException("FragmentChooseLevelBinding is null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLevelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding) {
            buttonLevelTest.setOnClickListener {
                launchGame(Level.TEST)
            }
            buttonLevelEasy.setOnClickListener {
                launchGame(Level.EASY)
            }
            buttonLevelNormal.setOnClickListener {
                launchGame(Level.NORMAL)
            }
            buttonLevelHard.setOnClickListener {
                launchGame(Level.HARD)
            }
        }
    }

    private fun launchGame(level: Level) {
        findNavController().navigate(
            ChooseLevelFragmentDirections.actionChooseLevelFragmentToGameFragment(level)
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}