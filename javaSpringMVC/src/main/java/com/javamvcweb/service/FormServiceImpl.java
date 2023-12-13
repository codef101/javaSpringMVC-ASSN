package com.javamvcweb.service;

import org.springframework.stereotype.Service;
import com.javamvcweb.model.UserEntity;

@Service
public class FormServiceImpl implements FormService {

    @Override
    public boolean validateForm(UserEntity userForm) {
        // Add your business logic for form validation here
        // For simplicity, let's assume the form is valid if all fields are non-empty
        return userForm != null &&
                userForm.getName() != null && !userForm.getName().isEmpty() &&
                userForm.getEmail() != null && !userForm.getEmail().isEmpty() &&
                userForm.getPassword() != null && !userForm.getPassword().isEmpty();
    }

    // You can implement more methods as needed for your business logic
}
