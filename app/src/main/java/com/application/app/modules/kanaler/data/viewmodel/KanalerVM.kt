package com.application.app.modules.kanaler.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.kanaler.`data`.model.KanalerModel

public class KanalerVM : ViewModel() {
  public val kanalerModel: MutableLiveData<KanalerModel> = MutableLiveData(KanalerModel())
}
