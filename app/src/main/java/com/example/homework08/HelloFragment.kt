package com.example.homework07

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework08.R
import com.example.homework08.databinding.FragmentHelloBinding

class HelloFragment : Fragment() {
    private lateinit var binding: FragmentHelloBinding
    private lateinit var animSlide: Animation

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHelloBinding.inflate(inflater)
        animSlide = AnimationUtils.loadAnimation(requireContext(), R.anim.anim_layout_slide_right_to_left_for_display)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonStart.setOnClickListener {
            view.startAnimation(animSlide)
            findNavController().navigate(R.id.action_helloFragment_to_quizFragment)
        }

    }
}