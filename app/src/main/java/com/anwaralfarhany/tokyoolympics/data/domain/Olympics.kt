package com.anwaralfarhany.tokyoolympics.data.domain

data class Olympics(
    val rank: Int,
    val team: String,
    val goldMedal: Int,
    val silverMedal: Int,
    val bronzeMedal: Int,
    val total: Int,
    val rankByTotal: Int,
    val nocCode: String
)

