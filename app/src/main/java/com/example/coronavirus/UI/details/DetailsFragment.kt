package com.example.coronavirus.UI.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.coronavirus.R
import com.example.coronavirus.databinding.DetailsPaysBinding

class DetailsFragment : Fragment() {

    private lateinit var detailsViewModel: DetailsViewModel
    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        detailsViewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)

        val binding: DetailsPaysBinding = DataBindingUtil.inflate(
            inflater, R.layout.details_pays, container, false
        )

        binding.viewModel = detailsViewModel

        binding.textView3.text = args.plantId

        return binding.root
    }
}