package com.anwaralfarhany.tokyoolympics.data

import com.anwaralfarhany.tokyoolympics.data.domain.Olympics

object DataManager {
    private val olympicsList =  mutableListOf<Olympics>()
    val olympics:List<Olympics>
        get() = olympicsList


    fun addOlympics(olympics: Olympics){
        olympicsList.add(olympics)
    }


}




