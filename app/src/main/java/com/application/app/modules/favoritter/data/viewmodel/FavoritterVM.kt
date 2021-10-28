package com.application.app.modules.favoritter.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.favoritter.`data`.model.FavoritterModel

public class FavoritterVM : ViewModel() {
  public val favoritterModel: MutableLiveData<FavoritterModel> = MutableLiveData(FavoritterModel())
}
