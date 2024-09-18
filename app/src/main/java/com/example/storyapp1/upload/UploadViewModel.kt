package com.example.storyapp1.upload

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.storyapp1.Prefrence.UserModel
import com.example.storyapp1.utils.UserRepository
import okhttp3.MultipartBody
import okhttp3.RequestBody

class UploadViewModel (private val repository: UserRepository) : ViewModel() {

    fun getSession(): LiveData<UserModel> {
        return repository.getSession().asLiveData()
    }

    fun getUpload(token: String, file: MultipartBody.Part, description: RequestBody) =
        repository.getUpload(token, file, description)


}