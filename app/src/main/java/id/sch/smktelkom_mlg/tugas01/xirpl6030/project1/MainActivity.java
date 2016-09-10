package id.sch.smktelkom_mlg.tugas01.xirpl6030.project1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Button bOk;
    TextView tvHasil;
    RadioButton rb1, rb2, rb3;
    CheckBox cbSp, cbSpa, cbAj, cbFc;
    Spinner spJenis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextnama);
        bOk = (Button) findViewById(R.id.buttonOk);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        rb1 = (RadioButton) findViewById(R.id.radioButton1mlm);
        rb2 = (RadioButton) findViewById(R.id.radioButton2mlm);
        rb3 = (RadioButton) findViewById(R.id.radioButton3mlm);
        cbSp = (CheckBox) findViewById(R.id.checkBoxSarapan);
        cbSpa = (CheckBox) findViewById(R.id.checkBoxSPA);
        cbAj = (CheckBox) findViewById(R.id.checkBoxAJ);
        cbFc = (CheckBox) findViewById(R.id.checkBoxFC);
        spJenis = (Spinner) findViewById(R.id.spinnerJenis);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();

            }
        });
    }

    private void doProcess() {

        String nama = etNama.getText().toString();
        String hasil = null;
        String cb = "Anda Memilih Fasilitas : \n   ";

        if (rb1.isChecked()) {
            hasil = rb1.getText().toString();
        } else if (rb2.isChecked()) {
            hasil = rb2.getText().toString();
        } else if (rb3.isChecked()) {
            hasil = rb3.getText().toString();
        }

        if (cbSp.isChecked()) cb += cbSp.getText() + "\n   ";
        if (cbSpa.isChecked()) cb += cbSpa.getText() + "\n   ";
        if (cbAj.isChecked()) cb += cbAj.getText() + "\n  ";
        if (cbFc.isChecked()) cb += cbFc.getText();

        tvHasil.setText("Anda bernama " + nama + " \nAnda memesan kamar untuk " + hasil
                + "\n" + cb + "\nAnda Memilih tipe kamar " + spJenis.getSelectedItem().toString());


    }
}
