package com.example.yanir.middleproject;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class AddContactActivity extends Activity {

    public static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        whenClickCancelSaveButton();
        whenClickAddPictureButton();
        EditText contactname = (EditText) findViewById(R.id.contactName);
        EditText contactaddress = (EditText) findViewById(R.id.contactAdress);
        EditText contactemail = (EditText) findViewById(R.id.contactEmail);
        EditText contactphone = (EditText) findViewById(R.id.contactPhone);
        EditText contactbirthdate = (EditText) findViewById(R.id.contctBirthDate);
        EditText contacttimetocall = (EditText) findViewById(R.id.contactTimeToCal);
        EditText contactdatetocall = (EditText) findViewById(R.id.contactTDateToCall);

    }

    public void whenClickAddPictureButton() {
        Button addContactPictureBtn;
        addContactPictureBtn = (Button) findViewById(R.id.contactAddPictureBtn);
        addContactPictureBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                }


            }

        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
                if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
                    Bundle extras = data.getExtras();
                    Bitmap imageBitmap;
                    imageBitmap = (Bitmap) extras.get("data");
                    ImageView contactimageview = (ImageView) findViewById(R.id.contactImagequickbadge);
                    contactimageview.setImageBitmap(imageBitmap);

        }

    }

    public void whenClickCancelSaveButton() {
        Button cancelButton = (Button) findViewById(R.id.cancelsavecontactbutton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }

        });


    }

}
