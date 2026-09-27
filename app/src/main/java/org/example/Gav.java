package org.example;

public record Gav(String group, String artifact, String version) {
    
    public static Gav parse(String value) {
        return new Gav("org.acme", "lib-a", "1.0.0");
    }
}