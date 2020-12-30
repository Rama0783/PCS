package com.appaja0783.ui.auth

import android.content.ComponentCallbacks
import android.content.Context
import com.appaja0783.data.model.ActionState
import com.appaja0783.data.repository.AuthRepository
import kotlinx.coroutines.*

object Appaja0783Auth {

    fun logout(context: Context, callback: ((ActionState<Boolean>) -> Unit)? = null){
        val repo = AuthRepository(context)
        CoroutineScope(Dispatchers.IO).launch {
            val resp = repo.logout()
            withContext(Dispatchers.Main){
                if (callback != null) callback.invoke(resp)
            }
        }
    }

}