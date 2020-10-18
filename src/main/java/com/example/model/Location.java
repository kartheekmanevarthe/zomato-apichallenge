package com.example.model;

import java.util.List;

public class Location {

    public List<LocationSuggestion> location_suggestions;
    public String status;
    public int has_more;
    public int has_total;
    public boolean user_has_addresses;

    public List<LocationSuggestion> getLocation_suggestions() {
        return location_suggestions;
    }

    public void setLocation_suggestions(List<LocationSuggestion> location_suggestions) {
        this.location_suggestions = location_suggestions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHas_more() {
        return has_more;
    }

    public void setHas_more(int has_more) {
        this.has_more = has_more;
    }

    public int getHas_total() {
        return has_total;
    }

    public void setHas_total(int has_total) {
        this.has_total = has_total;
    }

    public boolean isUser_has_addresses() {
        return user_has_addresses;
    }

    public void setUser_has_addresses(boolean user_has_addresses) {
        this.user_has_addresses = user_has_addresses;
    }
}
