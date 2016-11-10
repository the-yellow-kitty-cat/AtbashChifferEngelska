package Itello;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cof on 2016-11-07.
 */
public class MainTest {
    @Test
    public void crunchy() {
        String a = "crunchy";
        String atbashEncryption = Main.getAtbashEncryption(a);
        assertEquals("xifmxsb", atbashEncryption);
    }
    @Test
    public void Glass() {
        String a = "Glass";
        String atbashEncryption = Main.getAtbashEncryption(a);
        assertEquals("Tozhh", atbashEncryption);
    }
    @Test
    public void mening() {
        String a = "This is a sentence!";
        String atbashEncryption = Main.getAtbashEncryption(a);
        assertEquals("Gsrh rh z hvmgvmxv!", atbashEncryption);
    }
    @Test
    public void cat() {
        String a = "I am a cat! Meow? Meow!";
        String atbashEncryption = Main.getAtbashEncryption(a);
        assertEquals("R zn z xzg! Nvld? Nvld!", atbashEncryption);
    }
    @Test
    public void c() {
        String a = "c";
        String atbashEncryption = Main.getAtbashEncryption(a);
        assertEquals("x", atbashEncryption);
    }
    @Test
    public void  num() {
        String a = "0123456789";
        String atbashEncryption = Main.getAtbashEncryption(a);
        assertEquals("9876543210", atbashEncryption);
    }
    @Test
    public void hej(){
        String a ="hej";
        String atbashEncryption=Main.getAtbashEncryption(a);
        assertEquals("svq",atbashEncryption);
    }
}