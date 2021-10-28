package com.application.app.modules.afspiller.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.afspiller.`data`.model.AfspillerModel

public class AfspillerVM : ViewModel() {
  public val afspillerModel: MutableLiveData<AfspillerModel> = MutableLiveData(AfspillerModel())
}
