package com.assignment.todo.service;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class firebaseInitialize {
	@PostConstruct

	public void initialize() {


try {
	FileInputStream serviceAccount =
			  new FileInputStream("./serviceAccountKey.json");

			FirebaseOptions options = new FirebaseOptions.Builder()
  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
  .setDatabaseUrl ("https://todo-2cd63.firebaseio.com")
  .build();
			FirebaseApp.initializeApp(options);
}catch (IOException e) {
	e.printStackTrace();
}


	}
}
