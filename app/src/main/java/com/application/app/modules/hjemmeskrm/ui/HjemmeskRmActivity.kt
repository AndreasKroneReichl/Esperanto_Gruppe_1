package com.application.app.modules.hjemmeskrm.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityHjemmeskRmBinding
import com.application.app.modules.afspiller.ui.AfspillerActivity
import com.application.app.modules.favoritter.ui.FavoritterActivity
import com.application.app.modules.hjemmeskrm.`data`.model.HjemmeskRm1RowModel
import com.application.app.modules.hjemmeskrm.`data`.model.HjemmeskRm2RowModel
import com.application.app.modules.hjemmeskrm.`data`.viewmodel.HjemmeskRmVM
import com.application.app.modules.kanaler.ui.KanalerActivity
import com.application.app.modules.sg.ui.SGActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HjemmeskRmActivity :
    BaseActivity<ActivityHjemmeskRmBinding>(R.layout.activity_hjemmesk_rm) {
  private val viewModel: HjemmeskRmVM by viewModels<HjemmeskRmVM>()

  public override fun setUpClicks(): Unit {
    binding.frame8.setOnClickListener {

                              val destIntent = FavoritterActivity.getIntent(this, null)
                              startActivity(destIntent)

                            }
    binding.frame7.setOnClickListener {

                              val destIntent = KanalerActivity.getIntent(this, null)
                              startActivity(destIntent)

                            }
    binding.linear8.setOnClickListener {

                              val destIntent = SGActivity.getIntent(this, null)
                              startActivity(destIntent)

                            }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: HjemmeskRm1RowModel
  ): Unit {
    when(view.id) {
                            R.id.linear ->  {
                              val destIntent = AfspillerActivity.getIntent(this, null)
                              startActivity(destIntent)
                            }


                            }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: HjemmeskRm2RowModel
  ): Unit {
    when(view.id) {


                            }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                                                   
                            RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                                            object : RecyclerViewAdapter.OnItemClickListener {
                                                override fun onItemClick(view:View, position:Int,
        item :
                                HjemmeskRm1RowModel) {
                                                    onClickRecyclerView(view, position, item)
                                                }
                                            }
                                            )
    viewModel.recyclerViewList.observe(this) {
                                                recyclerViewAdapter.updateData(it)
                                            }
    val recyclerView1Adapter =
                                                   
                            RecyclerView1Adapter(viewModel.recyclerView1List.value?:mutableListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
                                            object : RecyclerView1Adapter.OnItemClickListener {
                                                override fun onItemClick(view:View, position:Int,
        item :
                                HjemmeskRm2RowModel) {
                                                    onClickRecyclerView1(view, position, item)
                                                }
                                            }
                                            )
    viewModel.recyclerView1List.observe(this) {
                                                recyclerView1Adapter.updateData(it)
                                            }
    binding.hjemmeskRmVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HJEMMESK_RM_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HjemmeskRmActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
