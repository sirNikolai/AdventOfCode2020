package io.github.sirnikolai.days;

import io.github.sirnikolai.AbstractSolution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day3Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private AbstractSolution subject;

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        subject = new Day3();
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testPart1() {
        //Given
        String input = "..##.......\n" +
                "#...#...#..\n" +
                ".#....#..#.\n" +
                "..#.#...#.#\n" +
                ".#...##..#.\n" +
                "..#.##.....\n" +
                ".#.#.#....#\n" +
                ".#........#\n" +
                "#.##...#...\n" +
                "#...##....#\n" +
                ".#..#...#.#";

        //When
        subject.Part1(input);

        //Then
        assertEquals("7" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPart2() {
        //Given
        String input = "..##.......\n" +
                "#...#...#..\n" +
                ".#....#..#.\n" +
                "..#.#...#.#\n" +
                ".#...##..#.\n" +
                "..#.##.....\n" +
                ".#.#.#....#\n" +
                ".#........#\n" +
                "#.##...#...\n" +
                "#...##....#\n" +
                ".#..#...#.#";

        //When
        subject.Part2(input);

        //Then
        assertEquals("336" + System.lineSeparator(), outContent.toString());
    }
}
