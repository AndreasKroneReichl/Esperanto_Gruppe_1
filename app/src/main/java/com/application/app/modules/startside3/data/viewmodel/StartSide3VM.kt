package com.application.app.modules.startside3.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.startside3.`data`.model.StartSide3Model

public class StartSide3VM : ViewModel() {
  public val startSide3Model: MutableLiveData<StartSide3Model> = MutableLiveData(StartSide3Model())
}
