package com.password;

 class PasswordValidator {
   public boolean isValid(String password) {
      return password.length() >=5 && password.length() <=10;

    }

}
