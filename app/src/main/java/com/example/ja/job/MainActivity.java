package com.example.ja.job;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{
    private Button btnBack;
    private Button btnAccount;
    private Button btnBank;
    private Button btnProject;
    private Button btnRight;
    private Button btnCash;
    private Button btnExchange;
    private Button btnMsg;
    private Button btnMsg2;
    private Button btnDepo;
    private Button btnRecharge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        btnBack = (Button) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);
        btnAccount = (Button) findViewById(R.id.btn_account);
        btnAccount.setOnClickListener(this);
        btnBank = (Button) findViewById(R.id.btn_bank);
        btnBank.setOnClickListener(this);
        btnRight = (Button) findViewById(R.id.btn_right);
        btnRight.setOnClickListener(this);
        btnCash = (Button) findViewById(R.id.btn_cash);
        btnCash.setOnClickListener(this);
        btnExchange = (Button) findViewById(R.id.btn_exchange);
        btnExchange.setOnClickListener(this);
        btnMsg = (Button) findViewById(R.id.btn_msg1);
        btnMsg.setOnClickListener(this);
        btnMsg2 = (Button) findViewById(R.id.btn_msg2);
        btnMsg2.setOnClickListener(this);
        btnProject = (Button) findViewById(R.id.btn_project);
        btnAccount.setOnClickListener(this);
        btnDepo = (Button) findViewById(R.id.btn_deposit);
        btnDepo.setOnClickListener(this);
        btnRecharge = (Button) findViewById(R.id.btn_recharge);
        btnRecharge.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        String backText;
        switch (v.getId()) {
            case R.id.btn_back:
                backText = btnBack.getText().toString();
                Toast.makeText(MainActivity.this, backText, Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.btn_account:
                String accountText = btnAccount.getText().toString();
                Toast.makeText(MainActivity.this, accountText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_bank:
                backText = btnBank.getText().toString();
                Toast.makeText(MainActivity.this, backText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_right:
                backText = btnRight.getText().toString();
                Toast.makeText(MainActivity.this, backText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_cash:
                backText = btnCash.getText().toString();
                Toast.makeText(MainActivity.this, backText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_exchange:
                backText = btnExchange.getText().toString();
                Toast.makeText(MainActivity.this, backText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_msg1:
                backText = btnMsg.getText().toString();
                Toast.makeText(MainActivity.this, backText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_msg2:
                backText = btnMsg2.getText().toString();
                Toast.makeText(MainActivity.this, backText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_recharge:
                backText = btnRecharge.getText().toString();
                Toast.makeText(MainActivity.this, backText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_deposit:
                backText = btnDepo.getText().toString();
                Toast.makeText(MainActivity.this, backText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_project:
                backText = btnProject.getText().toString();
                Toast.makeText(MainActivity.this, backText, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;

        }

    }
}
