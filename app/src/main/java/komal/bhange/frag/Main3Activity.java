package komal.bhange.frag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
WebView webView;
Button btn_html,btn_web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn_html=findViewById(R.id.loadFromStaticHtml);
        btn_web=findViewById(R.id.loadWebPage);
        webView=findViewById(R.id.simpleWebView);

        btn_html.setOnClickListener(this);
        btn_web.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.loadFromStaticHtml:
                String customHtml = "<html><body><h1>Hello, Android App Developer</h1>" +
                        "<h1>Heading 1</h1><h2>Heading 2</h2><h3>Heading 3</h3>" +
                        "<p>This is a sample paragraph of static HTML In Web view</p>" +
                        "</body></html>";
                webView.loadData(customHtml,"text/html","UTF-8");
                break;
            case R.id.loadWebPage:
                webView.setWebViewClient(new MYWebVIEWClient());
                String url ="https://developer.android.com/reference/android/app/FragmentManager";
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(url);
            break;
        }
    }

    private class MYWebVIEWClient extends WebViewClient { // inner cls

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String  url) {

 view.loadUrl(url);
            return true;
        }
    }
}
