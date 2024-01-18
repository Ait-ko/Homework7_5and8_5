package com.example.homework7_5and8_5.onboarding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.homework7_5and8_5.R
import com.example.homework7_5and8_5.databinding.ItemOnboardingBinding

class OnBoardingAdapter(private val onClick:()-> Unit): Adapter<OnBoardingAdapter.OnBoardingViewHolder>() {

private val list = arrayListOf<OnBoardingModel>(
    OnBoardingModel(R.raw.animation,"title1","deck1"),
    OnBoardingModel(R.raw.animation,"title2","deck2"),
    OnBoardingModel(R.raw.animation3,"title3","deck3"),
    OnBoardingModel(R.raw.animation3,"title4","deck4")

        )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingViewHolder {
        return OnBoardingViewHolder(ItemOnboardingBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: OnBoardingViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class OnBoardingViewHolder(private val binding: ItemOnboardingBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(boarding: OnBoardingModel){
            binding.apply {
                boarding.apply {
                    tvTitle.text = title
                    tvDescription.text = description
                }
                btnStart.isVisible = adapterPosition == list.lastIndex
                btnStart.setOnClickListener{onClick()}
            }
        }

    }
}