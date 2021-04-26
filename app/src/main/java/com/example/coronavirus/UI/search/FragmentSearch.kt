package com.example.coronavirus.UI.search


import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.coronavirus.R
import com.example.coronavirus.adapters.PaysListAdapter
import com.example.coronavirus.databinding.ActivityMainBinding
import com.example.coronavirus.databinding.FragmentPaysBinding
import com.example.coronavirus.models.Corona.Country

class SearchFragment : Fragment() {

    private lateinit var searchViewModel: SearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)

        val binding: FragmentPaysBinding = DataBindingUtil.inflate(
            inflater, R.layout.activity_main, container, false
        )

        searchViewModel.paysList.observe(viewLifecycleOwner, { plants ->
            val paysListAdapter = PaysListAdapter(plants) {
                val action = FragmentPaysDirections.actionNavigationSearchToDetailsPays(
                    paysID = it.nom
                )
                findNavController().navigate(action)
            }
            binding.recyclerViewPays.adapter = paysListAdapter
        })



        searchViewModel.getPlants()

        return binding.root
    }

}
