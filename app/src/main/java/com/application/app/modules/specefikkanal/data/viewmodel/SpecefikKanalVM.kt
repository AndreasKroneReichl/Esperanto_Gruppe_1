package com.application.app.modules.specefikkanal.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.specefikkanal.`data`.model.SpecefikKanalModel

public class SpecefikKanalVM : ViewModel() {
  public val specefikKanalModel: MutableLiveData<SpecefikKanalModel> =
      MutableLiveData(SpecefikKanalModel())
}
