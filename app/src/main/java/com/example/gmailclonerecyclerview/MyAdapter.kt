package com.example.gmailclonerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val gmailList: List<GmailModel>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
         var avtTV: TextView = row.findViewById(R.id.avt)
          var titleTV: TextView = row.findViewById(R.id.title_gmail)
          var contentTV: TextView = row.findViewById(R.id.content_gmail)
          var timeTV: TextView = row.findViewById(R.id.time_gmail)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.gmail_item, parent, false);
        return MyViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return gmailList.size;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.avtTV.text = gmailList[position].avt
        holder.titleTV.text = gmailList[position].title
        holder.contentTV.text = gmailList[position].content
        holder.timeTV.text = gmailList[position].time

    }
}