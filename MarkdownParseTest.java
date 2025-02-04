import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testGetLInks() throws IOException{
        MarkdownParse mp = new MarkdownParse();
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = mp.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add( "some-thing.html");

        assertEquals(expected, links);
    }
    @Test
    public void test1() throws IOException{
        MarkdownParse mp = new MarkdownParse();
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = mp.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add( "some-thing.html");
        assertEquals(expected, links);
    }
    @Test
    public void test2() throws IOException{
        MarkdownParse mp = new MarkdownParse();
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = mp.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add( "some-page.html");
        assertEquals(expected, links);
    }
    @Test
    public void test3() throws IOException{
        MarkdownParse mp = new MarkdownParse();
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = mp.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
    @Test
    public void test4() throws IOException{
        MarkdownParse mp = new MarkdownParse();
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = mp.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
    @Test
    public void test5() throws IOException{
        MarkdownParse mp = new MarkdownParse();
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = mp.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
    @Test
    public void test6() throws IOException{
        MarkdownParse mp = new MarkdownParse();
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = mp.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
    @Test
    public void test7() throws IOException{
        MarkdownParse mp = new MarkdownParse();
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = mp.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
    @Test
    public void test8() throws IOException{
        MarkdownParse mp = new MarkdownParse();
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = mp.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
    @Test
    public void test9() throws IOException{
        MarkdownParse mp = new MarkdownParse();
        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = mp.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("www.victorwu.net");
        assertEquals(expected, links);
}
@Test
public void testCodeBlockInLinks() throws IOException{
    MarkdownParse mp = new MarkdownParse();
    Path fileName = Path.of("snippet1.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = mp.getLinks(content);
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("`google.com, google.com, ucsd.edu");
    assertEquals(expected, links);
}
@Test
public void testNestedLinks() throws IOException{
    MarkdownParse mp = new MarkdownParse();
    Path fileName = Path.of("snippet2.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = mp.getLinks(content);
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("a.com, a.com(()), example.com");
    assertEquals(expected, links);
}
@Test
public void testLineBreaksandLength() throws IOException{
    MarkdownParse mp = new MarkdownParse();
    Path fileName = Path.of("snippet3.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = mp.getLinks(content);
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
    assertEquals(expected, links);
}
@Test

public void testWHATISHAPPENING() throws IOException{
    MarkdownParse mp = new MarkdownParse();
    Path fileName = Path.of("snippet5.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = mp.getLinks(content);
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("/uri");
    assertEquals(expected, links);
}
}
