package com.zeroone.pokedex.presentation.screen.main

import android.content.Context
import android.widget.Toast
import androidx.compose.material.ScaffoldState
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class AppState(
    val navHostController: NavHostController,
    val scaffoldState: ScaffoldState,
    val coroutineScope: CoroutineScope,
    val context: Context,
) {

    private var snackBarJob: Job? = null
    fun showSnackBar(message: String) {
        snackBarJob?.cancel()
        snackBarJob = coroutineScope.launch {
            scaffoldState.snackbarHostState.showSnackbar(message)
        }
    }

    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun notYetReady() {
        Toast.makeText(context, "Not yet ready", Toast.LENGTH_SHORT).show()
    }
}