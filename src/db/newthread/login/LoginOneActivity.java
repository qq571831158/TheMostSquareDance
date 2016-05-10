package db.newthread.login;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginOneActivity extends Activity{
	
	private EditText mUser;   //用户账号输入
	private EditText mPassword;    //用户密码输入

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_one);
        
        mUser = (EditText)findViewById(R.id.login_user_edit);
        mPassword = (EditText)findViewById(R.id.login_passwd_edit);
        
    }

    public void login_mainSquareDance(View v) {
    	
    	if("liuzhen".equals(mUser.getText().toString()) && "123456".equals(mPassword.getText().toString()))   
        {
             Intent intent = new Intent();
             intent.setClass(LoginOneActivity.this,LoadingActivity.class);
             startActivity(intent);
             
          }
        else if("".equals(mUser.getText().toString()) || "".equals(mPassword.getText().toString()))   
        {
        	new AlertDialog.Builder(LoginOneActivity.this)
			.setIcon(getResources().getDrawable(R.drawable.login_error_icon))
			.setTitle("错误！")
			.setMessage("用户名和密码为空\n请重新输入用户名和密码")
			.create().show();
         }
        else{
           
        	new AlertDialog.Builder(LoginOneActivity.this)
			.setIcon(getResources().getDrawable(R.drawable.login_error_icon))
			.setTitle("错误！")
			.setMessage("密码错误\n请重新输入密码")
			.create().show();
        }
    	
    
    	/*
      	Intent intent = new Intent();
		intent.setClass(Login.this,Whatsnew.class);
		startActivity(intent);
		Toast.makeText(getApplicationContext(), "��¼�ɹ�", Toast.LENGTH_SHORT).show();
		this.finish();*/
      }  
    public void login_back(View v) {     
      	this.finish();
      }  
    public void login_pw(View v) {     
    	Uri uri = Uri.parse("http://3g.qq.com"); 
    	Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
    	startActivity(intent);
    	//Intent intent = new Intent();
    	//intent.setClass(Login.this,Whatsnew.class);
        //startActivity(intent);
      }  

}
