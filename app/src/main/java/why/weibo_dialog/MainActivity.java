package why.weibo_dialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import why.weibo_dialog.view.MiddleDialog;

/**
 * 创建者     Ted
 * 创建时间   2016/10/10 14:27
 * 描述	      ${TODO}$
 * <p/>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}$
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initEvent();
    }

    private void initEvent() {
        ivadd.setOnClickListener(this);
    }

    private void initData() {

    }

    private void initView() {
        this.ivadd = (ImageView) findViewById(R.id.iv_add);
    }

    @Override
    public void onClick(View v) {
        //点击中间的加号按钮, 弹出dialog
        MiddleDialog dialog = new MiddleDialog(this);
        dialog.show();

//        //设置dialog宽度铺满屏幕
        WindowManager windowManager = getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
        lp.width = (int)(display.getWidth()); //设置宽度
        dialog.getWindow().setAttributes(lp);
    }
}
