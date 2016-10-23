package anascoding.com.br.salvandoestadoaplicacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String nome;
    private int idade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            this.nome = savedInstanceState.getString("nome");
            this.idade = savedInstanceState.getInt("idade");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("nome", "Algum Nome");
        outState.putInt("idade", 23);
        super.onSaveInstanceState(outState);
    }
}
