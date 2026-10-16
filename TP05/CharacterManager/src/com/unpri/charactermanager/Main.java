package com.unpri.charactermanager;

import java.util.ArrayList;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        // Menambahkan karakter
        Character c1 = new Character("Arthur", 10, CharacterType.WARRIOR);
        Character c2 = new Character("Merlin", 15, CharacterType.MAGE);
        Character c3 = new Character("Robin", 8, CharacterType.ARCHER);
        Character c4 = new Character("Luna", 12, CharacterType.MAGE);

        System.out.println("=== TAMBAH KARAKTER ===");
        System.out.println("Arthur: " + manager.addCharacter(c1));
        System.out.println("Merlin: " + manager.addCharacter(c2));
        System.out.println("Robin: " + manager.addCharacter(c3));
        System.out.println("Luna: " + manager.addCharacter(c4));

        // Menguji nama duplikat
        System.out.println("\n=== TES DUPLIKAT ===");
        Character duplicate =
                new Character("ARTHUR", 20, CharacterType.HEALER);

        System.out.println("Duplikat ditambahkan: "
                + manager.addCharacter(duplicate));

        // Menampilkan semua karakter
        System.out.println("\n=== SEMUA KARAKTER ===");
        for (Character c : manager.getAllCharacters()) {
            System.out.println(c);
        }

        // Mencari karakter
        System.out.println("\n=== CARI KARAKTER ===");
        Character found = manager.findByName("Merlin");
        System.out.println(found);

        // Mini-challenge
        System.out.println("\n=== MINI CHALLENGE ===");
        System.out.println("Total karakter: "
                + manager.getTotalCharacters());

        System.out.println("Rata-rata level: "
                + manager.getAverageLevel());

        ArrayList<Character> mages =
                manager.findByType(CharacterType.MAGE);

        System.out.println("Jumlah Mage: " + mages.size());

        for (Character c : mages) {
            System.out.println(c);
        }

        // Fitur analitik mandiri
        System.out.println("\n=== ANALITIK ===");
        System.out.println("Jumlah Warrior: "
                + manager.countByType(CharacterType.WARRIOR));

        // Menguji defensive copy
        System.out.println("\n=== TES SALINAN LIST ===");
        ArrayList<Character> copy = manager.getAllCharacters();
        copy.clear();

        System.out.println("Jumlah dalam salinan: " + copy.size());
        System.out.println("Jumlah dalam manager: "
                + manager.getTotalCharacters());

        // Menguji reference
        System.out.println("\n=== TES REFERENCE ===");
        Character a = new Character("Test", 5, CharacterType.WARRIOR);
        Character b = a;

        b.setLevel(8);

        System.out.println("Level a: " + a.getLevel());
        System.out.println("a == b: " + (a == b));

        // Menghapus karakter
        System.out.println("\n=== HAPUS KARAKTER ===");
        System.out.println("Merlin dihapus: "
                + manager.removeCharacter("Merlin"));

        System.out.println("Total setelah dihapus: "
                + manager.getTotalCharacters());

        // Menguji list kosong
        System.out.println("\n=== TES LIST KOSONG ===");
        CharacterManager emptyManager = new CharacterManager();

        System.out.println("Rata-rata list kosong: "
                + emptyManager.getAverageLevel());

        System.out.println("\nTotal objek dibuat: "
                + Character.getTotalCharacterCreated());
    }
}