package pl.kuba.taskapp.taskapp.service;

public interface SecurityService {

    String findLoggedInUser();
    void autologin(String username, String password);
}
