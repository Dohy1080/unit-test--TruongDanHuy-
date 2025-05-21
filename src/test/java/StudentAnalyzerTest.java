import org.example.StudentAnalyzer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    StudentAnalyzer analyzer = new StudentAnalyzer();

    // ======= TEST CHO countExcellentStudents =======
    @Test
    public void testCountExcellentStudents_MixedValidInvalid() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_AllValid() {
        List<Double> scores = Arrays.asList(10.0, 8.0, 6.0, 7.5);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        List<Double> scores = Collections.emptyList();
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        List<Double> scores = Arrays.asList(0.0, 10.0, 8.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_InvalidOnly() {
        List<Double> scores = Arrays.asList(-5.0, 11.0, 15.0);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    // ======= TEST CHO calculateValidAverage =======
    @Test
    public void testCalculateValidAverage_MixedValidInvalid() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.17, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_AllValid() {
        List<Double> scores = Arrays.asList(6.0, 8.0, 10.0);
        assertEquals(8.0, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        List<Double> scores = Collections.emptyList();
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.0);
    }

    @Test
    public void testCalculateValidAverage_BoundaryValues() {
        List<Double> scores = Arrays.asList(0.0, 10.0);
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.0);
    }

    @Test
    public void testCalculateValidAverage_InvalidOnly() {
        List<Double> scores = Arrays.asList(-3.0, 11.0, 20.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.0);
    }
}
