package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    void testClassifyEnergy() {
        PlaylistRecommender p = new PlaylistRecommender();
        assertEquals("HIGH", p.classifyEnergy(Arrays.asList(150, 140)));
    }

    @Test
    void testIsValidTrackTitle() {
        PlaylistRecommender p = new PlaylistRecommender();
        assertTrue(p.isValidTrackTitle("Hello World"));
    }

    @Test
    void testNormalizeVolume() {
        PlaylistRecommender p = new PlaylistRecommender();
        assertEquals(100, p.normalizeVolume(200));
    }
}
