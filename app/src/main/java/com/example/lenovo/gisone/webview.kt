package com.example.lenovo.gisone

import android.graphics.Bitmap
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.webview.*

class webview : AppCompatActivity() {

    val query = "https://www.google.co.id/maps?safe=strict&q=";
    val queryParams = "&um=1&ie=UTF-8&sa=X&ved=0ahUKEwiElJiQ1_rhAhVGiXAKHdVOAPUQ_AUIDygC"
    val city = "jakarta";
    val result = "$query$city$queryParams"
    private val url = result

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.webview)

        val settings = webview.settings;

        settings.javaScriptEnabled = true

        settings.setAppCacheEnabled(true)
        settings.cacheMode = WebSettings.LOAD_DEFAULT
        settings.setAppCachePath(cacheDir.path)


        settings.setSupportZoom(true)
        settings.builtInZoomControls = true
        settings.displayZoomControls = true
        settings.blockNetworkImage = false
        settings.loadsImagesAutomatically = true



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            settings.safeBrowsingEnabled = true  // api 26
        }

        settings.useWideViewPort = true
        settings.loadWithOverviewMode = true
        settings.javaScriptCanOpenWindowsAutomatically = true
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            settings.mediaPlaybackRequiresUserGesture = false
        }


        settings.domStorageEnabled = true
        settings.setSupportMultipleWindows (true)
        settings.loadWithOverviewMode = true
        settings.allowContentAccess = true
        settings.setGeolocationEnabled(true)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            settings.allowUniversalAccessFromFileURLs = true
        }

        settings.allowFileAccess = true
        webview.fitsSystemWindows = true
        webview.setLayerType(View.LAYER_TYPE_HARDWARE, null)
        webview.loadUrl(url)


        webview.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {
            }

            override fun onPageFinished(view: WebView, url: String) {
            }
        }
    }

    override fun onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack()
        }
    }
}