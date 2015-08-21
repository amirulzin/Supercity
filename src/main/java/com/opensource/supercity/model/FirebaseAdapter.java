package com.opensource.supercity.model;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.concurrent.CountDownLatch;

public class FirebaseAdapter {
    public void process() {
    }

    public void setup() throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        final Firebase firebase = new Firebase("https://cybercitizen.firebaseio.com");
        firebase.authWithCustomToken("Atd9V0mo" + "QaHePRFm4Os" + "FrA9sAF3r" + "avRl5JBOSv8K", new Firebase.AuthResultHandler() {
            @Override
            public void onAuthenticated(AuthData authData) {
                System.out.println("Succes auth!");
                countDownLatch.countDown();
            }

            @Override
            public void onAuthenticationError(FirebaseError firebaseError) {
                countDownLatch.countDown();
                throw new IllegalStateException("auth error: " + firebaseError.getMessage());
            }
        });
        countDownLatch.await();
    }
}
