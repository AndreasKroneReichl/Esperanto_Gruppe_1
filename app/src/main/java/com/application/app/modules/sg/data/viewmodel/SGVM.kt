package com.application.app.modules.sg.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.sg.`data`.model.SGModel

public class SGVM : ViewModel() {
  public val sGModel: MutableLiveData<SGModel> = MutableLiveData(SGModel())
}
