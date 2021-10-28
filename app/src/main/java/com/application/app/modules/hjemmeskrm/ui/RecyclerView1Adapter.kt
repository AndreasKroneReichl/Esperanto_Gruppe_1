package com.application.app.modules.hjemmeskrm.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowHjemmeskRm2Binding
import com.application.app.modules.hjemmeskrm.`data`.model.HjemmeskRm2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public var list: List<HjemmeskRm2RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowHjemmeskRm2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<HjemmeskRm2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHjemmeskRm2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_hjemmesk_rm2,parent,false)
    return RowHjemmeskRm2VH(view)
  }

  public override fun onBindViewHolder(holder: RowHjemmeskRm2VH, position: Int): Unit {
    val hjemmeskRm2RowModel = HjemmeskRm2RowModel()
    // TODO uncomment following line after integration with data source
    // val hjemmeskRm2RowModel = list[position]
    holder.binding.hjemmeskRm2RowModel = hjemmeskRm2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HjemmeskRm2RowModel
    ): Unit {
    }
  }

  public inner class RowHjemmeskRm2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHjemmeskRm2Binding = RowHjemmeskRm2Binding.bind(itemView)
  }
}
