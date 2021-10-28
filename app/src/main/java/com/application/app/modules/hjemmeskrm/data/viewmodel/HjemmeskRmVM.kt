package com.application.app.modules.hjemmeskrm.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.hjemmeskrm.`data`.model.HjemmeskRm1RowModel
import com.application.app.modules.hjemmeskrm.`data`.model.HjemmeskRm2RowModel
import com.application.app.modules.hjemmeskrm.`data`.model.HjemmeskRmModel
import kotlin.collections.MutableList

public class HjemmeskRmVM : ViewModel() {
  public val hjemmeskRmModel: MutableLiveData<HjemmeskRmModel> = MutableLiveData(HjemmeskRmModel())

  public val recyclerViewList: MutableLiveData<MutableList<HjemmeskRm1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView1List: MutableLiveData<MutableList<HjemmeskRm2RowModel>> =
      MutableLiveData(mutableListOf())
}
