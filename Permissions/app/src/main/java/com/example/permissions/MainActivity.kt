package com.example.permissions

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.ActivityCompat
import com.example.permissions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            requestPermission()
        }
    }
    private fun hasWirteExternalStoragePermission() =
        ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
    private fun hasForegroundPermission() =
        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
    private fun hasLocationbackgroundPermissionn() =
        ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
        private fun requestPermission(){
            val permisiionToRequest = mutableListOf<String>()
            if (!hasWirteExternalStoragePermission()){
                permisiionToRequest.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)

            }
            if (!hasForegroundPermission()){
                permisiionToRequest.add(Manifest.permission.ACCESS_COARSE_LOCATION)

            }
            if (!hasLocationbackgroundPermissionn()){
                permisiionToRequest.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)

            }
            if (permisiionToRequest.isNotEmpty()){
                ActivityCompat.requestPermissions(this, permisiionToRequest.toTypedArray() , 0)
            }


        }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if ( requestCode == 0 && grantResults.isNotEmpty()){
            for (i in grantResults.indices){
                if (grantResults[i] == PackageManager.PERMISSION_GRANTED){
                    Log.d("PermissionsRequest" , "${permissions[i]} granted.")
                }
            }
        }
    }
}






