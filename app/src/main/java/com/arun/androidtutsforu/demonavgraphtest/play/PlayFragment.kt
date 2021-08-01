package com.arun.androidtutsforu.demonavgraphtest.play

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arun.androidtutsforu.demonavgraphtest.R
import com.arun.androidtutsforu.demonavgraphtest.databinding.FragmentPlayBinding

class PlayFragment : Fragment() {

    var score =0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentPlayBinding.inflate(inflater,container,false)
        binding.btPlay.setOnClickListener {
            binding.tvScore.text = (score++).toString()
        }
        return binding.root
    }


}