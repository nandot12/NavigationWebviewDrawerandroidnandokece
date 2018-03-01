package id.co.digitalindo.navigationwebviewdrawerandroidnandokece;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    //TODO 5
    //untuk bisa di akses di class lain butuh tambhkan public static
   public static WebView  web ;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //TODO 1
        View v =  inflater.inflate(R.layout.fragment_home, container, false);


        //TODO 2
        web = v.findViewById(R.id.webview);
        web.loadUrl("http://detik.com");

        //TODO 3

        //supaya tidak ngelink k chrome
        web.setWebViewClient(new MyWeb());


        return v ;
    }

    //TODO 5
    private class MyWeb extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return super.shouldOverrideUrlLoading(view, url);
        }
    }


}
