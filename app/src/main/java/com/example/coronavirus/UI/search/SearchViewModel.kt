package com.example.coronavirus.UI.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coronavirus.models.Corona.Country

class SearchViewModel : ViewModel() {

    val paysList = MutableLiveData<List<Country>>()

    fun getPlants(){
        paysList.value = listOf(
            Country("France",7000,2500,3000),
            Country("Allemagne",8000,3000,2000),
            Country("Espagne",6000,2000,4000),
            Country("Angleterre",10000,5000,4000)

        )
    }

}
