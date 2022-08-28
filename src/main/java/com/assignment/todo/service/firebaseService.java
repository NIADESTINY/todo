package com.assignment.todo.service;
import com.assignment.todo.model.ToDo;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

@Service
public class firebaseService {
	public String saveTodoDetails(ToDo todo) throws InterruptedException,ExecutionException{
		Firestore dbFirestore = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("todo").document(todo.getTodo_name()).set(todo);
		return collectionsApiFuture.get().getUpdateTime().toString();
	}
}
