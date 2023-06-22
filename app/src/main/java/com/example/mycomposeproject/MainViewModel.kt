package com.example.mycomposeproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mycomposeproject.domain.InstaModel
import kotlin.random.Random

class MainViewModel : ViewModel() {

    private val initialList = mutableListOf<InstaModel>().apply {
        repeat(500) {
            add(
                InstaModel(
                    id = it,
                    title = "Title $it",
                    isFollowed = Random.nextBoolean()
                )
            )
        }
    }

    private val _instaModels = MutableLiveData<List<InstaModel>>(initialList)
    val instaModels: LiveData<List<InstaModel>> = _instaModels

    fun changeFollowingStatus(model: InstaModel) {
        val modifiedList =
            _instaModels.value?.toMutableList()
                ?: mutableListOf()

        modifiedList.replaceAll {
            if (it == model) {
                it.copy(isFollowed = !it.isFollowed)
            } else {
                it
            }
        }
        _instaModels.value = modifiedList
    }

   fun deleteInstaModel(model: InstaModel) {

        val modifiedList =
            _instaModels.value?.toMutableList()
                ?: mutableListOf()

        modifiedList.remove(model)

        _instaModels.value = modifiedList
    }
}