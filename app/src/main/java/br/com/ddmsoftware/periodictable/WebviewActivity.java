package br.com.ddmsoftware.periodictable;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;

public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        assert extra != null;
        String url = extra.getString(ResultActivity2.URL_MESSAGE);

        WebView browser = findViewById(R.id.webView2);

        if (!(url != null && url.equals( "" ))) {
            // Load images automatically
            browser.getSettings().setLoadsImagesAutomatically(true);
            // Enable Java script support
            //browser.getSettings().setJavaScriptEnabled(true);

            // Enable side scroll bars
            browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

            // Load Navigation configuration inside webView -- method implemented below
            browser.setWebViewClient(new MyBrowser());
            browser.loadUrl(url);

        }

        // Load Advertisement Banner
        AdView mAdView = findViewById(R.id.adViewBrowser);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        // Obtain the FirebaseAnalytics instance.
        FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, getString(R.string.webViewId));
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, getString(R.string.firebird_webviewMessage));
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, getString(R.string.firebird_image));
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // handle arrow click here
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

    private class MyBrowser extends WebViewClient {

        @Override
        // Configure navigation inside webView, in the place of web browser
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        final String message = getResources().getString(R.string.loading );
        final ProgressDialog dialog = ProgressDialog.show(WebviewActivity.this, "", message, true);

        @Override
        public void onPageFinished(WebView view, String url) {
            dialog.dismiss();
        }
    }


}
