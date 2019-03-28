package br.com.etecia.appempresaabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txtUsuario, txtSenha;
    Button sairSistema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        txtUsuario = (EditText) findViewById(R.id.edtUsuario);
        txtSenha = (EditText) findViewById(R.id.edtSenha);
        sairSistema = (Button)findViewById(R.id.btnSair);


        sairSistema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        };



    public void entrarApp(View view) {

        String usuario = txtUsuario.getText().toString();
        String senha = txtSenha.getText().toString();

        if (usuario.equals("etecia") && senha.equals("etecia")) {

          Toast.makeText(getApplicationContext(),"Bem vindo ao sistema",Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(getApplicationContext(), MenuPrincipalActivity.class);

            Intent intent = new Intent(LoginActivity.this, MenuPrincipalActivity.class);
            startActivity(intent);


        }else{
            Toast.makeText(getApplicationContext(),"Usuário ou senha inválidos",Toast.LENGTH_SHORT).show();
        }
    }
}
