package com.example.jc.myapplication.memento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jc.myapplication.R;

public class MementoActivity extends AppCompatActivity implements View.OnClickListener {


    NoteEditText noteEditText;
    TextView mSavaTv;
    TextView mUndoBtn;
    TextView mRedoBtn;

    NoteCaretaker noteCaretaker = new NoteCaretaker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento);

        initViews();
    }

    private void initViews() {
        noteEditText = findViewById(R.id.note_et);
        mUndoBtn = findViewById(R.id.undo_btn);
        mUndoBtn.setOnClickListener(this);
        mRedoBtn = findViewById(R.id.redo_btn);
        mRedoBtn.setOnClickListener(this);
        mSavaTv = findViewById(R.id.save_tv);
        mSavaTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.undo_btn:
                noteEditText.restore(noteCaretaker.getPrevMemoto());
                makeToast("撤销 : ");
                break;
            case R.id.redo_btn:
                noteEditText.restore(noteCaretaker.getNextMemoto());
                makeToast("恢复 : ");
                break;
            case R.id.save_tv:
                noteCaretaker.saveMemoto(noteEditText.createMemoto());
                makeToast("保存 : ");
                break;
            default:
                break;
        }
    }

    private void makeToast(String s) {
        Toast.makeText(this, s + " 光标位置 ："
                + noteEditText.getSelectionStart(), Toast.LENGTH_SHORT).show();

        Log.v(getClass().getSimpleName(), s + noteEditText.getText());
    }
}
