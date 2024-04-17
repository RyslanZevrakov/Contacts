package com.example.contacts


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.contacts.ui.theme.ContactsTheme
import com.example.contacts.ui.theme.Jock


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactsTheme {

               Jock()
            }
        }
    }
}



