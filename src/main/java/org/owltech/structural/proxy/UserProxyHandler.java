package org.owltech.structural.proxy;

public class UserProxyHandler implements UserProxy {
    private boolean isLoggedIn;

    public UserProxyHandler(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    @Override
    public User getUser() {
        User user;
        if (this.isLoggedIn) {
            user = new AuthorizedUser();
        } else {
            user = new GuestUser();
        }
        return user;
    }
}
