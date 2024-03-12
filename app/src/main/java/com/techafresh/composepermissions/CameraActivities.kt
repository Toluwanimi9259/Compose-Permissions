package com.techafresh.composepermissions

import android.annotation.SuppressLint
import android.content.Context
import android.location.Geocoder
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.content.FileProvider
import com.github.dhaval2404.imagepicker.ImagePicker
import java.util.Locale
import java.util.Objects

//@SuppressLint("ComposableNaming")

fun takePhoto(mainActivity: MainActivity){
    // Start The Camera
    Log.d("TAG", "takePhoto: Picture Taken")
}