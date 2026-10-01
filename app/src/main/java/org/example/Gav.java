package org.example;

public record Gav(String group, String artifact, String version) {

    public static Gav parse(String value) {
        String[] parts = value.split(":");

        return new Gav(parts[0], parts[1], parts[2]);
    }
}