package com.application.app.modules.hjemmeskrm.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowHjemmeskRm1Binding
import com.application.app.modules.hjemmeskrm.`data`.model.HjemmeskRm1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<HjemmeskRm1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowHjemmeskRm1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<HjemmeskRm1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHjemmeskRm1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_hjemmesk_rm1,parent,false)
    return RowHjemmeskRm1VH(view)
  }

  public override fun onBindViewHolder(holder: RowHjemmeskRm1VH, position: Int): Unit {
    val hjemmeskRm1RowModel = HjemmeskRm1RowModel()
    // TODO uncomment following line after integration with data source
    // val hjemmeskRm1RowModel = list[position]
    holder.binding.hjemmeskRm1RowModel = hjemmeskRm1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HjemmeskRm1RowModel
    ): Unit {
    }
  }

  public inner class RowHjemmeskRm1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHjemmeskRm1Binding = RowHjemmeskRm1Binding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HjemmeskRm1RowModel())
      }
    }
  }
}
