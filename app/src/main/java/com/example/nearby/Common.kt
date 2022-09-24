package com.example.nearby

import com.example.nearby.Model.Results
import com.example.nearby.Remote.IGoogleAPIService
import com.example.nearby.Remote.RetrofitClient

object Common1 {
    var currentResult: Results? = null
    private val GOOGLE_API_URL="https://maps.googleapis.com/"
    val googleApiService: IGoogleAPIService
    get()= RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService::class.java)
}