package com.example;

import java.util.List;

public class LionAlex extends Lion {
    private static String placeOfResidence= "Нью-Йоркский зоопарк";
    private static final List<String> friends = List.of("Мелмон", "Марти", "Глория");
    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

}
