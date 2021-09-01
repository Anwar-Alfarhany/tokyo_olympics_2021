package com.anwaralfarhany.tokyoolympics.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anwaralfarhany.tokyoolympics.R
import com.anwaralfarhany.tokyoolympics.data.domain.Olympics
import com.anwaralfarhany.tokyoolympics.databinding.ItemOlympicsBinding

class OlympicsAdapter(val list: List<Olympics>): RecyclerView.Adapter<OlympicsAdapter.OlympicsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OlympicsViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_olympics, parent, false)
        return OlympicsViewHolder(view)
    }

    override fun onBindViewHolder(holder: OlympicsViewHolder, position: Int) {
        val currentOlympics = list[position]
        holder.binding.apply {
            teamId.text = currentOlympics.team
            nocId.text =currentOlympics.nocCode
            goldId.text =currentOlympics.goldMedal.toString()
            silverId.text = currentOlympics.silverMedal.toString()
            bronzeId.text = currentOlympics.bronzeMedal.toString()
            totalId.text = currentOlympics.total.toString()
            rankId.text = currentOlympics.rank.toString()
            totalByRankId.text = currentOlympics.rankByTotal.toString()

        }

    }

    override fun getItemCount() = list.size

    class OlympicsViewHolder(viewItem: View): RecyclerView.ViewHolder(viewItem) {
        val binding = ItemOlympicsBinding.bind(viewItem)
    }

}