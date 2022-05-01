package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class AnimalTest {

    @Test
    public void shouldPredatorAnimalHasFood() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood =List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = animal.getFood("Хищник");
        Assert.assertEquals(expectedFood,actualFood);
    }

    @Test
    public void shouldHerbivoreAnimalHasFood() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood =List.of("Трава", "Различные растения");
        List<String> actualFood = animal.getFood("Травоядное");
        Assert.assertEquals(expectedFood,actualFood);
    }

    @Test
    public void shouldUnknownAnimalHasExceptionAboutFood() throws Exception {
        String expectedErrorMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        String actualErrorMessage = null;
        new Animal().getFood("Киборг");
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Test
    public void  shouldAnimalHasFamilyInfoTest() {
     Animal animal = new Animal();
     String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
     String actualFamily = animal.getFamily();
     Assert.assertEquals(expectedFamily,actualFamily);
    }
}