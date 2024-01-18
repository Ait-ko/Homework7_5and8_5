package com.example.homework7_5and8_5.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.homework7_5and8_5.R
import com.example.homework7_5and8_5.databinding.FragmentOnBoardingBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnBoardingFragment : Fragment() {

    private val adapter = OnBoardingAdapter(this::onClick)
    private lateinit var binding: FragmentOnBoardingBinding

    @Inject
    lateinit var pref: Pref
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = adapter
        binding.circleIndicator.setViewPager(binding.viewPager)
    }

    private fun onClick() {
        pref.onBoardingShow()
        findNavController().navigate(R.id.MainFragment)
    }
}
