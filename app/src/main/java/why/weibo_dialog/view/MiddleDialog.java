package why.weibo_dialog.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import why.weibo_dialog.R;

/**
 * 创建者     Ted
 * 创建时间   2016/10/10 11:34
 * 描述	     自定义的dialog类, 点击中间加号时弹出
 * <p/>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
public class MiddleDialog extends Dialog implements View.OnClickListener {

    private Context mContext;
    private ImageView ivclose;
    private TextView tvtext;
    private TextView tvphoto;
    private TextView tvartical;
    private TextView tvsign;
    private TextView tvlive;
    private TextView tvmore;

    public MiddleDialog(Context context) {

        //调用可以控制主题的构造方法
        this(context, R.style.WeiboStyleDialog);
        this.mContext = context;

        //设置dialog可以沉底显示
        Window window = getWindow();
        window.setGravity(Gravity.BOTTOM);
    }

    public MiddleDialog(Context context, int themeResId) {
        super(context, themeResId);
    }


    protected MiddleDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
        initData();
        initListener();
    }

    /**
     * 初始化view
     */
    public void initView() {
        setContentView(R.layout.dialog_weibo);
        this.tvmore = (TextView) findViewById(R.id.tv_more);
        this.tvlive = (TextView) findViewById(R.id.tv_live);
        this.tvsign = (TextView) findViewById(R.id.tv_sign);
        this.tvartical = (TextView) findViewById(R.id.tv_artical);
        this.tvphoto = (TextView) findViewById(R.id.tv_photo);
        this.tvtext = (TextView) findViewById(R.id.tv_text);
        this.ivclose = (ImageView) findViewById(R.id.iv_close);
    }

    /**
     * 初始化数据
     */
    public void initData() {

    }

    /**
     * 初始化监听
     */
    public void initListener() {
        tvmore.setOnClickListener(this);
        tvlive.setOnClickListener(this);
        tvsign.setOnClickListener(this);
        tvartical.setOnClickListener(this);
        tvphoto.setOnClickListener(this);
        tvtext.setOnClickListener(this);
        ivclose.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_close://关闭按钮
                dismiss();//关闭对话框
                break;
            case R.id.tv_artical://文章
                Toast.makeText(mContext, "点击了文章", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_live://直播
                Toast.makeText(mContext, "点击了直播", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_more://更多
                Toast.makeText(mContext, "点击了更多", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_photo://照片
                Toast.makeText(mContext, "点击了照片", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_sign://签到
                Toast.makeText(mContext, "点击了签到", Toast.LENGTH_SHORT).show();
                break;

            case R.id.tv_text://文本
                Toast.makeText(mContext, "点击了签到", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
