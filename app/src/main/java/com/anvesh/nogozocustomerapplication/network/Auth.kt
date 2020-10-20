package com.anvesh.nogozocustomerapplication.network

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import java.util.concurrent.TimeUnit

class Auth {

    fun login(email: String, password: String): Task<AuthResult> {
        return FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
    }

    fun register(email: String, password: String): Task<AuthResult>{
        return FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
    }
  /** fun verifyOtp(phoneno:String,callbacks: PhoneAuthProvider.OnVerificationStateChangedCallbacks):Task<AuthResult>{
       return PhoneAuthProvider.getInstance().verifyPhoneNumber(
           phoneno, // Phone number to verify
           60, // Timeout duration
           TimeUnit.SECONDS, // Unit of timeout
           this, // Activity (for callback binding)
           callbacks)
    }**/

}