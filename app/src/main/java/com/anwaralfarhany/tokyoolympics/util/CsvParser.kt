package com.anwaralfarhany.tokyoolympics.util

import com.anwaralfarhany.tokyoolympics.data.domain.Olympics

class CsvParser {
    fun parse(line:String): Olympics{
        val tokens = line.split(",")
        return Olympics(   //    الي جوه كله هذا اوبجكت من نوع match
            rank = tokens[Constants.ColumnIndex.RANK].toInt(),
            team= tokens[Constants.ColumnIndex.TEAM],
            goldMedal= tokens[Constants.ColumnIndex.GOLD_MEDAL].toInt(),
            silverMedal = tokens[Constants.ColumnIndex.SILVER_MEDAL].toInt(),
            bronzeMedal = tokens[Constants.ColumnIndex.BRONZE_MEDAL].toInt(),
            nocCode = tokens[Constants.ColumnIndex.NOC_CODE],
            rankByTotal = tokens[Constants.ColumnIndex.RANK_BY_TOTAL].toInt(),
            total = tokens[Constants.ColumnIndex.TOTAL].toInt(),
        )
    }
}