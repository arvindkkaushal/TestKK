package com.arv.mynytimes.model

data class DataResponse(val status:String,val num_results:Int,val results: List<Result>) {
}